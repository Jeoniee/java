package study;

import java.util.Scanner;

public class java0913 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(N + " * " + i + " = " + (N*i));
		}

	}

}
