package com.app.dao;

import org.hibernate.*;
import static com.app.utils.HibernateUtils.getFactory;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.app.entities.Role;
import com.app.entities.User;

public class UserDaoImpl implements UserDao {

	@Override
	public String registerUser(User user) {
		// user : transient(neither associated with L1 cache nor in DB)
		String mesg = "Registration failed !!!!";
		// 1. get Session from SF
//		Session session = getFactory().openSession();
//		Session session2 = getFactory().openSession();
//		System.out.println(session == session2);// f
		Session session = getFactory().getCurrentSession();
		Session session2 = getFactory().getCurrentSession();// db cn is pooled out n
		System.out.println(session == session2);// t
		// L1 cache is created -- EMPTY
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		System.out.println("session is open " + session.isOpen() + " is conncted " + session.isConnected());// t t

		try {
			// 3. Session API -- public Serializable save(Object o) throws HibExc
			Serializable userId = session.save(user);// transient entity ref transient -> persistant
			/*
			 * Hibernate adds transient entity ref to L1 cache user : PERSISTENT (part of L1
			 * cache , BUT not yet part of DB)
			 */
			System.out.println("Id class " + userId.getClass());
			tx.commit();
			System.out.println("session is open " + session.isOpen() + " is conncted " + session.isConnected());// f f

			/*
			 * Hibernate performs 1. session.flush() --> hib does auto dirty
			 * checking(=checking the state of L1 cache against DB) performs DML -- insert
			 * Persistent entites (transient -> persistent : save | persist |saveOrUpdate |
			 * merge will gain DB identity, upon commmit session.close(); -L1 cache is
			 * destroyed n pooled out db cn rets to the DBCP
			 */
			// rec will be inserted in db
			mesg = "User registered successfully , with ID =  " + userId;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		System.out.println("session is open " + session.isOpen() + " is conncted " + session.isConnected());// f f

		// user - DETACHED (doesn't exist in L1 cache , BUT has DB identity)
		return mesg;
	}

	@Override
	public User getUserDetails(Long userId) {
		User user = null;// user - does not exist (in the java heap n not in L1 cache)
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// 3. get user details by it's id
			user = session.get(User.class, userId);// select * from users where id=?
			user = session.get(User.class, userId);
			user = session.get(User.class, userId);
			user = session.get(User.class, userId);
			// user - null (id doesn't exist) OR in case of valid id --
			// PERSISTENT (part of L1 cache , does have db identity)
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return user;// user - if id valid then DETACHED | if id is invalid doesn 't exist
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = null;
		String jpql = "select u from User u"; // select * from users meaning : select user from user
		// 1. get session from sessionFactory(get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin tx
		Transaction tx = session.beginTransaction();
		try {
			// 3.create query object & execute the same
//			public Query<T> createQuery(String hql/jpql,
//			Class<T> class) throws HibernateExc
//			Query API too exec query
//			List<T> getResultList();

			users = session.createQuery(jpql, User.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the exc to caller
			throw e;
		}
		return users;
	}

	public List<User> getAllUsersByDobAndRole(LocalDate start, LocalDate end, Role role1) {
		List<User> users = null;
//		String jpql = "select u from User u where dob between :start and :end and role=:rl";
		String jpql = "select u from User u where u.dob between :begin and :end and u.role=:userRole";
		
		// 1. get session from sessionFactory(get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin tx
		Transaction tx = session.beginTransaction();
		try {
//			users = session.createQuery(jpql,User.class).setParameter(1, begin);

			users = session.createQuery(jpql, User.class).setParameter("begin", start).setParameter("end", end)
					.setParameter("userRole", role1).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the exc to caller
			throw e;
		}
		return users;
	}
	
	public List<User> getAllUsersNamesByDobAndRole(LocalDate start, LocalDate end, Role role1) {
		List<User> users = null;
//		String jpql = "select u from User u where dob between :start and :end and role=:rl";
		String jpql = "select new com.app.entities.User(firstName) from User u where u.dob between :begin and :end and u.role=:userRole";
		
		// 1. get session from sessionFactory(get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin tx
		Transaction tx = session.beginTransaction();
		try {
//			users = session.createQuery(jpql,User.class).setParameter(1, begin);

			users = session.createQuery(jpql, User.class)
					.setParameter("begin", start)
					.setParameter("end", end)
					.setParameter("userRole", role1)
					.getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the exc to caller
			throw e;
		}
		return users;
	}

	@Override
	public User getSingleUser(String email, String password) {
		User user = null;
		String jpql = "select u from User u where u.email=:email and u.password=:password";
		// 1. get session from sessionFactory(get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.createQuery(jpql, User.class).setParameter("email", email).setParameter("password", password)
					.getSingleResult();

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the exc to caller
			throw e;
		}
		return user;
	}

	@Override
	public String getChangePassword(String email, String oldpwd, String newpwd) {
		String mesg = "change pwd failed";
		User user = null;
		String jpql = "select u from User u where u.email=:email and u.password=:password";
		// 1. get session from sessionFactory(get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.createQuery(jpql, User.class)
					.setParameter("email", email)
					.setParameter("password", oldpwd)
					.getSingleResult();//select query
			// => valid login --> user : persistent
			user.setPassword(newpwd);//updating state of persistent entity
			tx.commit(); //update query automatically fired
			mesg = "password changed";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the exc to caller
			throw e;
		}
		user.setPassword("9923361320"); //u are changing pwd of detached entity
		return mesg;
	}

//	getSingleResult()

}
