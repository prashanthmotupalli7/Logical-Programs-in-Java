package test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
	
		int count=0;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check : ");
		int n=sc.nextInt();
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
			count++;
			break;
			}
		}
		if(count==0) {
			System.out.println(n+" is a prime");
		}
		else {
			System.out.println(n+" is not a prime");
		}
	}
}
