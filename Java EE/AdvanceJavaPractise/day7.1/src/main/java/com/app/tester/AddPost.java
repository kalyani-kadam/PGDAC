package com.app.tester;

import static com.app.entities.Role.valueOf;
import static com.app.utils.HibernateUtils.getFactory;
import static java.time.LocalDate.parse;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.PostDao;
import com.app.dao.PostDaoImpl;
import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.Posts;
import com.app.entities.User;

public class AddPost {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			PostDao postDao = new PostDaoImpl();
			System.out.println("Enter details content, description, image_path, title");
			Posts transientPost = new Posts(sc.next(), sc.next(), sc.next(), sc.next());
			System.out.println(postDao.addPost(transientPost));

		} // JVM sf.close() => cleaning up of DBCP
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
