package study;

import java.util.Scanner;

public class java0916 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		int sum = 0;
		for(int i=1;i<=a;i++) {
			sum+=i;
		}System.out.println(sum);

	}

}
