package study;

import java.util.Scanner;

public class java0927 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		
		in.close();


		for(int i = 1;i<=a;i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
		System.out.println();
		}	
	}

}