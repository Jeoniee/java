package study;

public class DAY1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
				System.out.println();
			}
		
		
		for(int i=5;i>0;i--) {
			for(int j=4;j>0;j--) {
				if(i>j) {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		for(int i=5;i<=1;i--) {
				System.out.print(" ");
				System.out.println();
			}for(int j=0;j<=5;j++) {
				System.out.print("*");
			}
				System.out.println();
		}

}