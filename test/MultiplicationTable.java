package test;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print Multiplication table :  ");
		int n = sc.nextInt();
		int i=1;
		while(i<11)
		
		{
			System.out.println(n + " * " + i +" = " + n * i);
			i++;

	}
	sc.close();

}
}