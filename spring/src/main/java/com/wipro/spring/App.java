package com.wipro.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wipro.spring.bean.Employee;

@Configuration
@ComponentScan(basePackages = "com.wipro.spring.*")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "welcome to spring core" );
        ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        Employee t1=(Employee)context.getBean("e1");
    }
}
