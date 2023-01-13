package test;


	class MyThread6 extends Thread
	{}
	public class ThreadNameDemo
	{
	public static void main(String[] args)
	{
	System.out.println(Thread.currentThread().getName());//main
	MyThread6 t=new MyThread6();
	System.out.println(t.getName());//Thread-0
	Thread.currentThread().setName("Prashanth Thread");
	System.out.println(Thread.currentThread().getName());
	}
	}
