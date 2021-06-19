package com.Design;

class Eager {

	private static Eager t = new Eager();

	private Eager() {

	}

	public static Eager getInstance() {
		return t;
	}

}

class Lazy {

	private static Lazy t = null;

	private Lazy() {
		
	}

	public static Lazy getInstance() {
		if(t==null) {
			t=new Lazy();
		}
		return t;
	}
}

class SingletonThread{
	
	private static SingletonThread t = null;

	private SingletonThread() {
		
	}

	public static  synchronized SingletonThread getInstance() {
		if(t==null) {
			t=new SingletonThread();
		}
		return t;
	}
}

class SingleTonBlockThread{
	
	private static SingleTonBlockThread t = null;

	private SingleTonBlockThread() {
		
	}

	public static  synchronized SingleTonBlockThread getInstance() {
		if(t==null) {
			synchronized (SingleTonBlockThread.class) {
				if(t==null) {
					t=new SingleTonBlockThread();
				}
			}
		}
		return t;
	}
}

public class SingleTon {

	public static void main(String[] args) {

		Eager t1 = Eager.getInstance();
		System.out.println(t1);

		Eager t2 = Eager.getInstance();
		System.out.println(t2);
		
		Lazy l1 = Lazy.getInstance();
		System.out.println(l1);

		Lazy l2 = Lazy.getInstance();
		System.out.println(l2);
		
		SingletonThread s1 = SingletonThread.getInstance();
		System.out.println(s1);

		SingletonThread s2 = SingletonThread.getInstance();
		System.out.println(s2);
		
		SingleTonBlockThread st1 = SingleTonBlockThread.getInstance();
		System.out.println(st1);

		SingleTonBlockThread st2 = SingleTonBlockThread.getInstance();
		System.out.println(st2);
		

	}

}
