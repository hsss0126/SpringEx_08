package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

//		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
//
//		Connection shs_connection = ctx.getBean("shs_connection",Connection.class);
//		System.out.println("아이디: "+shs_connection.getId());
//		System.out.println("비밀번호: "+shs_connection.getPassword());
//
//		Connection nhs_connection = ctx.getBean("nhs_connection",Connection.class);
//		System.out.println("아이디: "+nhs_connection.getId());
//		System.out.println("비밀번호: "+nhs_connection.getPassword());
//
//		ctx.close();

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Connection shs_connection = ctx.getBean("shs_connection",Connection.class);
		System.out.println("아이디: "+shs_connection.getId());
		System.out.println("비밀번호: "+shs_connection.getPassword());

		Connection nhs_connection = ctx.getBean("nhs_connection",Connection.class);
		System.out.println("아이디: "+nhs_connection.getId());
		System.out.println("비밀번호: "+nhs_connection.getPassword());

		ctx.close();
	}

}
