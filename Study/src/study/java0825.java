package study;

import java.util.Scanner;

public class java0825 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a [] = new int [6];
		int b [] = {1 , 1, 2, 2,2,8};
		for(int i=0;i<a.length; i++) {
		
			a[i] = in.nextInt();
			
		}
		for(int i=0;i<a.length;i++){
		
		System.out.print(b[i]-a[i]+ " ");
		
		
		}

	}

}
