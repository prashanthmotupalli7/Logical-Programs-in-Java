package test;

import java.util.Scanner;

public class PallidromeNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number to check : ");
	int n=sc.nextInt();
	int rev=0;
	int rem;
	int temp=n;
	while(temp>0) {
		rem=n%10;
		rev=(rev*10)+rem;
		temp=temp/10;
	}
if(rev==n) {
	System.out.println(n+" is a pallindrome number");
}
else {
	System.out.println(n+" is not a pallindrome number");

}
}
}
