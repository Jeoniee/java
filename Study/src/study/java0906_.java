package study;

import java.util.Scanner;

public class java0906_ {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int Y = in.nextInt();
			in.close();
			
			if(Y%4==0) {
				if(Y%400==0) System.out.println("1");
				else if(Y%100==0) System.out.println("0");
				else System.out.println("1");
			}else System.out.println("0");
			}
}


