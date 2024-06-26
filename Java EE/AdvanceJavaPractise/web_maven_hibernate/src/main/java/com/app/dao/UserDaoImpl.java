package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User signIn(String email, String password) {
		User user = null;
		String jpql = "select u from User u where u.email=:email and u.password=:password";
		// 1. get session from sessionFactory(get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin tx
		Transaction tx = session.beginTransaction();
		try {
			user = session.createQuery(jpql, User.class)
					.setParameter("email", email)
					.setParameter("password", password)
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

}
