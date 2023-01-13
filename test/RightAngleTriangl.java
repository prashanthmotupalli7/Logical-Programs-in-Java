package test;

import java.util.Scanner;

public class RightAngleTriangl
{            
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println(" Enter n value");
        	int n=sc.nextInt();
            int i, j, k = 1;
            for (i = 1; i <= n; i++) {
                for (j = 1; j< i + 1; j++) {
                    System.out.print(k++ + " ");
                }
       
                System.out.println();
            }
        }
       
    }