package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.*;

public class MainApp {
	public static void main(String[] args){
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[]{"Beans.xml"});
		
		TextEditor obj = (TextEditor) context.getBean("helloWorld");
		
		obj.spellCheck();
		
		System.out.println();
		
		TextEditor obj1 = (TextEditor) context.getBean("textEditor");
		
		obj1.getName();
		
		System.out.println();
		
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		
		jc.getAddressList();
		jc.getAddressMap();
		jc.getAddressSet();
		jc.getAddressProp();
		
		System.out.println();
		
		Student st = (Student) context.getBean("student");
		
		System.out.println("Name : " + st.getName());
		System.out.println("age : " + st.getAge());
		
		st.printThrowException();
		
		((AbstractApplicationContext) context).start();
		System.out.println();
		
		HW obj2 = (HW) context.getBean("hW");
		
		obj2.getMessage();
		
		((AbstractApplicationContext) context).stop();
		
		System.out.println();
		
		ConfigurableApplicationContext con = new ClassPathXmlApplicationContext(new String[]{"Beans.xml"});
		
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		
		cvp.publish();
		
		cvp.publish();
	}

}
