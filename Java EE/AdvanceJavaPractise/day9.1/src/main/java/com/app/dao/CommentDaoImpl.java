package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.BlogPost;
import com.app.entities.Comment;
import com.app.entities.User;

public class CommentDaoImpl implements CommentDao {

	@Override
	public String addNewComment(Comment comment, Long commenterId, Long postId) {
		String mesg = "adding category failed";
		// 1. get session from SF (getCurrentSession)
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			BlogPost pid = session.get(BlogPost.class, postId);
			User uid = session.get(User.class, commenterId);
// stop the blogger commenting on his/her own post
			if (pid != null && uid != null && commenterId != pid.getId()) {
				comment.setUser(uid);
				comment.setPost(pid);
			}
			session.persist(comment);
			tx.commit();
			mesg = "Added new comment with ID=" + comment.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}
		return mesg;
	}

	public List<Comment> getCommentByPostTitle(String title) {
		List<Comment> comments = null;
		String jpql = "select c from Comment c where c.post.title=:title";
//		String jpql = "select b from BlogPost b";
//		String jpql = "select new com.app.entities.Comment(commentText) from Comment c where c.post.title=:title";
		// 1. get session from sessionFactory(get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin tx
		Transaction tx = session.beginTransaction();
		try {
			
			comments = session.createQuery(jpql,Comment.class)
					.setParameter("title", title)
					.getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the exc to caller
			throw e;
		}
//		System.out.println("return");
		return comments;
	}
}
