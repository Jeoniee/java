package study;

import java.util.Scanner;

public class java0929 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int result = 0;
		for(int i = 0; i<5 ; i++) {
			int n = in.nextInt();
			result +=n*n;
		}
		System.out.println(result%10);
	}

}
