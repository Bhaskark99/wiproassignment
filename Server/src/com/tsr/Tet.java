package com.tsr;

public class Tet {

	public static void main(String[] args) {
		Thread t =new Thread(()->
		{
			System.out.println("thread");
		});
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());

	}

}
