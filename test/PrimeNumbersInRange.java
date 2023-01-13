package test;

import java.util.Scanner;

public class PrimeNumbersInRange {

	public static void main(String[] args) {
		int i;
		int j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lower value  :");
		int low=sc.nextInt();
		System.out.print("Enter upper value  :");
		int upper=sc.nextInt();
		for( i=low;i<=upper;i++) {
			for( j=2;j<=i;j++) {
				if(i%j==0)
					break;
			}
		
		if(i==j)
			System.out.print(j+" ");
					
		}
	

	}

}
