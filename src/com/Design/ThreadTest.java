package com.Design;

class ThreadA extends Thread{
	int total=0;
	
	public void run() {
		
	synchronized(this) {
		System.out.println("Start calculation");
		
		for(int i=0;i<=10;i++) {
			total=total+i;
		}
		
		System.out.println("ThreadB giving notification ");
		this.notify();
	}
	
	}
}


public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadA t= new ThreadA();
		t.start();
		
		synchronized (t) {
			System.out.println("Call wait method to thread A");
			t.wait();
			
			System.out.println("Get the notification");
			
			System.out.println(t.total);
		}

	}

}
