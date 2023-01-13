package test;

import java.util.Scanner;

public class NanakuPremaThoPuzzle {

	public static void main(String[] args) {
		int a = 1;
		int personAlive = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of persons in circle : ");
		int noOfPersons = sc.nextInt();
		System.out.print("Enter which persons dies first: ");
		int personNo = sc.nextInt();
		if (personNo == 2) {
			while (a <= noOfPersons) {
				a = a * 2;
				personAlive = (2 * noOfPersons) - a + 1;
			}
			System.out.print("Alived Person : " + personAlive);

		}

		else {
			System.out.print("Logic won't work if second person didn't dies first  ");

		}

	}

}
