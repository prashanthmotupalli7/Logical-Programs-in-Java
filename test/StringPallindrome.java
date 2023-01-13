package test;

import java.util.Scanner;

public class StringPallindrome {
	public static void main(String[] args) {

        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        
        if(a.equalsIgnoreCase(b))
        	System.out.println(a+ " is a pallindrome");
        else
        	System.out.println(a+ " is not a pallindrome");

	

	}
}
