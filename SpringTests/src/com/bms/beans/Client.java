package com.bms.beans;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client 
{
	public static void load() throws IOException
	{
		Properties props  = new Properties();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id:");
		String id = scan.nextLine();
		System.out.println("Enter Name:");
		String name = scan.nextLine();
		System.out.println("Enter street:");
		String street = scan.nextLine();
		System.out.println("Enter City:");
		String city = scan.nextLine();
		System.out.println("Enter State:");
		String state = scan.nextLine();
		System.out.println("Enter Country:");
		String country = scan.nextLine();
		props.put("id", id);
		props.put("name", name);
		props.put("street", street);
		props.put("city", city);
		props.put("state", state);
		props.put("country", country);
		//System.out.println(props);
		FileOutputStream fos = new FileOutputStream("src//details.properties");
		props.store(fos, "commit");
	}
	public static void main(String args[]) throws Exception
	{
		//load();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		GreetingsImpl g = ctx.getBean("obj",GreetingsImpl.class);
		g.greetingMessage();
	}
}
