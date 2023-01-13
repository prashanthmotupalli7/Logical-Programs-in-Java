package test;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.next();
		sc.close();
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		if(str.equals(rev)) {
		System.out.println(str+" is a pallindrome");
	}
}
}