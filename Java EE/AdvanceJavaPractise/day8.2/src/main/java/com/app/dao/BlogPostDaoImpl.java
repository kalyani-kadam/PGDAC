package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.BlogPost;
import com.app.entities.Category;
import com.app.entities.User;

public class BlogPostDaoImpl implements BlogPostDao {

	@Override
	public String createNewBlog(BlogPost post, Long categoryId, Long authorId) {
		String msg = "adding new post failed!!";
		// 1. get session from sessionFactory(get curnt session)
		Session session = getFactory().getCurrentSession();
		// 2. begin tx
		Transaction tx = session.beginTransaction();
		try {
//			1 . get category from its id
			Category cat = session.get(Category.class, categoryId);
//			2. get author from its id
			User author = session.get(User.class, authorId);
//			null checking --if not null
			if(cat != null && author != null) {
				
//			establish association btw post --> author and post --> category
//			setter 
				post.setChosenCategory(cat);
				post.setAuthor(author);
//			since no cascading yet  -- explicitly pesist post entity
				session.persist(post);
				msg="added new post with id "+post.getId();
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the exc to caller
			throw e;
		}
		return msg;
	}

}
