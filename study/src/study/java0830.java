package study;

import java.util.Scanner;

public class java0830 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			int a = in.nextInt();
			int b = in.nextInt();
			
			in.close();
			
			
			System.out.println(a*(b%10));
			System.out.println(a*(b%100/10));	
			System.out.println(a*(b/100));		
			System.out.println(a*b);
	
	
	}

}
