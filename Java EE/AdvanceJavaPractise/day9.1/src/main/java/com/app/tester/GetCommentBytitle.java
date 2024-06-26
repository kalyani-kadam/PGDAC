package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.CategoryDao;
import com.app.dao.CategoryDaoImpl;
import com.app.dao.CommentDao;
import com.app.dao.CommentDaoImpl;
import com.app.entities.BlogPost;
import com.app.entities.Category;
import com.app.entities.Comment;

public class GetCommentBytitle {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create category dao instance
			CommentDao dao = new CommentDaoImpl();			
			System.out.println("Enter blog title to search");			
//			List<Comment> comment=dao.getCommentByPostTitle(sc.next());
//			System.out.println(comment);
//			System.out.println("All comments - ");
			dao.getCommentByPostTitle(sc.next())
						.forEach(u -> System.out.println(u.getCommentText()));
//			Comment p = new Comment();
//			System.out.println(p.getCommentText());
//			Comment.(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
