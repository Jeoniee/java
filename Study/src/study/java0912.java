package study;

import java.util.Scanner;

public class java0912 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		in.close();
		
	
		if(A != B && B != C && A != C) {
			int max;
			
			if(A > B) {
				if(C > A) {
					max = C;
				}else {
					max =A;
				}
			}else {
				if(C>B) {
					max =C;
				}else {
					max =B;
				}
				
			}
			System.out.println(max * 100);
		}else {
			if(A==B && A== C) {
				System.out.println(10000+A*1000);
			}else {
				if(A==B || A==C) {
					System.out.println(1000 + A * 100);
				}else {
					System.out.println(1000 + B * 100);
				}
			}
		}
		
		
		
	}

}
