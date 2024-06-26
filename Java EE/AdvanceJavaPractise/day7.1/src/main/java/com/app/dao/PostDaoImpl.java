package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.Posts;

public class PostDaoImpl implements PostDao {
	public String addPost(Posts post) {
		String msg = "Registration failed !!!!";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		System.out.println("session is open " + session.isOpen() + " is conncted " + session.isConnected());// t t

		try {
			Serializable postId = session.save(post);
			post = session.get(Posts.class, postId);
			System.out.println("In id " + postId.getClass());
			tx.commit();
			msg = "post added with id " + postId;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return msg;
	}

	@Override
	public Posts getPostDetails(Long postId) {
		Posts post = null;// user - does not exist (in the java heap n not in L1 cache)
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// 3. get user details by it's id
			post = session.get(Posts.class, postId);// select * from users where id=?
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return post;// user - if id valid then DETACHED | if id is invalid doesn 't exist
	}

	public List<Posts> getAllPostDetails() {
		List<Posts> posts=null;
		String jpql = "select p from Posts p";
		// 1. get session from sessionFactory(get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin tx
		Transaction tx = session.beginTransaction();
		try {
			posts = session.createQuery(jpql,Posts.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the exc to caller
			throw e;
		}
		return posts;
	}
	
	
}
