package dev.a2.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
	    //test
		//test1
		//test2
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	    obj.getMessage();
	    obj.getMessage();
	    
	    //for loop from mac
	    for(int i = 0; i < 100; i++) {
	    	System.out.println("hello world");
	    }
	    
	    
	   }

}
