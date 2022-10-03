package study;

import java.util.Scanner;

public class java1003 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		
		for(int i =1 ;i <= N ;i++) {
			for(int z = 1 ;z <= N-i ;z++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}

}
