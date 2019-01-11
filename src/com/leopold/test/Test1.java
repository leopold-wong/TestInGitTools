package com.leopold.test;

public class Test1 {
	public void test1() {
		System.out.println("Test1.test1()");
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		t.start();
	}
	
	
	class InnerTest1 {
		
	}
}
