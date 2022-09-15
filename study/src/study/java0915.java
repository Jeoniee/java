package study;

import java.util.Scanner;

public class java0915 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int arr[] = new int[A];
		
		for(int i = 0;i < A; i++) {
			int b = in.nextInt();
			int c = in.nextInt();
			arr[i] = b + c;
			
		}
		in.close();
		for(int k : arr) {
			System.out.println(k);
		}
	}

}
