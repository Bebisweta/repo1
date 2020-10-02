package com.nt.test;

public class MyThread extends Thread {

	public void run() {
		System.out.println(this.getName());
		 System.out.println(Thread.currentThread().getName());
		
	}

}
