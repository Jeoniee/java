package study;

import java.util.Scanner;

public class java09061 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		if(A>0 && B>0) {
			System.out.println("1");
		}else if(A<0 &&B>0) System.out.println("2");
		else if(A>0 && B<0) System.out.println("4");
		else if(A<0 && B<0) System.out.println("3");
		
	
	}

}
