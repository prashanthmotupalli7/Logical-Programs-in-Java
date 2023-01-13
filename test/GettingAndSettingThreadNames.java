package test;

class MyThread2 extends Thread
{
	
}

public class GettingAndSettingThreadNames {

public static void main(String[] args)
{
System.out.println(Thread.currentThread().getName());//main
MyThread2 t=new MyThread2();
System.out.println(t.getName());//Thread-0
Thread.currentThread().setName("Nazeer Thread");
System.out.println(Thread.currentThread().getName());
}
}
