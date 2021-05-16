package br.com.rf.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
			
		// retrieve bean from spring Container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		// Close the context
		
		context.close();
		
	}

}
