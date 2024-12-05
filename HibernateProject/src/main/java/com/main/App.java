package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.User;



public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/config/hibernate.cfg.xml");
		
		User user1 = new User();
		user1.setName("raghav");
		user1.setEmail("raghav@gmail.com");
		
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		//insert user
//		
//		try {
//			session.save(user1);
//			transaction.commit();
//			System.out.println("User Added Successfully!");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Something went WRONG!");
//			
//		}
		
		//read user
//		try {
//			
//			User user2 = session.get(User.class,1L);
//			System.out.println(user2.getId());
//			System.out.println(user2.getName());
//			System.out.println(user2.getEmail());
//		}
//		catch (Exception e) {
	//	e.printStackTrace();
//			System.out.println("User NOT FOUND!");
//			
//		}
		
		//update user details
		
//		User user3 = new User();
//		user3.setId(3L);
//		user3.setName("deepika");
//		user3.setEmail("deepika@gmail.com");
//		
//		
//		try {
//		
//			session.saveOrUpdate(user3);
//			transaction.commit();
//			System.out.println("User Updated Successfully!");
//			
//
//		}
//		catch (Exception e) {
//			transaction.rollback();
//			e.printStackTrace();
//			System.out.println("User NOT FOUND!");
//			
//		}
		
		//delete user
		User user = new User();
		user.setId(3L);
		
		
		try {
		
			session.delete(user);
			transaction.commit();
			System.out.println("User Deleted Successfully!");
			

		}
		catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			System.out.println("User NOT FOUND!");
			
		}

		

	}

}
