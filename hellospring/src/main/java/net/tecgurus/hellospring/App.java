package net.tecgurus.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		// "HolaBean" es el ID del Bean en el Spring-Module.xml
		HolaMundo obj = (HolaMundo) context.getBean("HolaBean");
		obj.printHello();
	}

}