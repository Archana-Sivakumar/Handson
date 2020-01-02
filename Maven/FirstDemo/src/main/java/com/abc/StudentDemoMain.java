package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentServiceImpl   studentServiceImpl=(StudentServiceImpl)context.getBean("studentService");
		studentServiceImpl.add();
	}

}
