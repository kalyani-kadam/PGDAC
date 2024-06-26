package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.CategoryDao;
import com.app.dao.CategoryDaoImpl;
import com.app.dao.CommentDao;
import com.app.dao.CommentDaoImpl;
import com.app.entities.Category;
import com.app.entities.Comment;

public class AddNewComment {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create category dao instance
			CommentDao dao = new CommentDaoImpl();
			//for testing - do not add any white space
			System.out.println("Enter comment details - comment , rating , user id , post id\r\n"
					+ "");
			Comment comment= new Comment(sc.next(),sc.nextInt()); 
//			Comment cat = dao.AddNewComment(comment,sc.nextInt(),sc.nextInt());
//			System.out.println(dao.addNewCategory(cat));
			System.out.println(dao.addNewComment(comment,sc.nextLong(),sc.nextLong()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
