package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.Role;
import com.app.entities.User;
import static java.time.LocalDate.parse;
import static com.app.entities.Role.valueOf;

public class GetAllUserDetailsByemailAndpwd {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			UserDao userDao = new UserDaoImpl();
			System.out.println("enter email and pwd");
			System.out.println(userDao.getSingleUser(sc.next(), sc.next()));
//			userDao.get.forEach(System.out::println); //list is iterable
		} // JVM sf.close() => cleaning up of DBCP
		catch (Exception e) {
//			System.out.println("user not exist");
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}

}
