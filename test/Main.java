package test;

class Main1 {
String name;
	public void eat() {
		System.out.println("I can eat");
		
	}

}

final class Dog extends Main1{
	
	public void display() {
		System.out.println("my name is"+name);
	}
}

public class Main {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.name="rambo";
		d.eat();
		d.display();
	}
}