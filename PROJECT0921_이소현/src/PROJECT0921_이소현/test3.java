package PROJECT0921_이소현;

import java.util.Scanner;

public class test3 {
	   public static void main(String[] args) {
		      // TODO Auto-generated method stub
		      Scanner sc = new Scanner(System.in);
		      int num;

		      System.out.print("정수를 입력하시오 >> ");
		      num = sc.nextInt();
		      
		      for(int i=0; i<num; i++) {
		         for(int j=0; j<num-i; j++) {
		            System.out.print("*");
		         }
		         System.out.println();
		      }
		      
		      sc.close();
		   }
}
