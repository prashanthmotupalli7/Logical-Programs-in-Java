package test;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enet number to find factorial : ");
		int n=s.nextInt();
	

		int fact=1;
			for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
			System.out.print("The factorial of "+n+" is : "+fact);
			s.close();
	}
	
}

