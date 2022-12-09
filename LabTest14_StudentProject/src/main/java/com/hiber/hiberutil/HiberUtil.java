package com.hiber.hiberutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {

	public static Session getSession() 
	{

		//configuring the hibernate
		Configuration config = new Configuration();
		config.configure();

		//creating the session
		SessionFactory factory = config.buildSessionFactory();
		return factory.openSession();
	}
}
