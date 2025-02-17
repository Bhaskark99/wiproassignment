package com.wipro.in;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee("John", 30);

        
        Predicate<Employee> isAdult = p -> p.getAge() > 18;

        
        Function<Employee, String> getName = Employee::getName;

        
        Consumer<Employee> changeName = p -> p.setName("Alice");

        
        Supplier<String> greetingMessage = () -> "Hello, welcome to the system!";

        
        Functionme.operateOnEmp(emp, isAdult, getName, changeName, greetingMessage);

	}

}
