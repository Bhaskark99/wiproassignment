package com.wipro.springmvc.execption;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ResponseStatus(reason = "sorry i cant divide number by zero",code=HttpStatus.NOT_FOUND)
	@ExceptionHandler(ArithmeticException.class)
    public void exhandler()
    {
    	System.out.println("exception hnadle");
    	
    }
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handles()
	{
		return new ResponseEntity<String>("null value found",HttpStatus.NOT_FOUND);
	}
	@ResponseStatus(reason = "employe data not found",code =HttpStatus.NOT_FOUND )
	@ExceptionHandler(EmployeeNotFound.class)
	public void exhandler1()
	{
		
	}
}
