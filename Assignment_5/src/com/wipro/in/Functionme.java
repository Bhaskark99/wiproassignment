package com.wipro.in;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functionme {
	
	    public static void operateOnEmp(Employee emp, 
	                                        Predicate<Employee> predicate,
	                                        Function<Employee, String> function,
	                                        Consumer<Employee> consumer,
	                                        Supplier<String> supplier) {
	       
	        if (predicate.test(emp)) {
	            System.out.println("Predicate: Person meets the condition.");
	        } else {
	            System.out.println("Predicate: Person does not meet the condition.");
	        }

	       
	        String name = function.apply(emp);
	        System.out.println("Function: Person's name is " + name);

	        
	        consumer.accept(emp);
	        System.out.println("Consumer: Person's new name is " + emp.getName());

	        
	        String message = supplier.get();
	        System.out.println("Supplier: " + message);
	    }

	   
	}
	

