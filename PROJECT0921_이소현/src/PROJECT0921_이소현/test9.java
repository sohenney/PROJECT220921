package PROJECT0921_이소현;

public class test9 {
	   public static void main(String[] args) {
		      // TODO Auto-generated method stub
		      int arr[][] = new int[4][4];
		      
		      for(int i=0; i<arr.length; i++) {
		         for(int j=0; j<arr[i].length;j++) {
		            arr[i][j] = (int)(Math.random()*10+1);
		         }
		      }
		      
		      for(int i=0; i<arr.length; i++) {
		         for(int j=0; j<arr[i].length; j++) {
		            System.out.print(arr[i][j] + " ");
		         }
		         System.out.println();
		      }
		   }
}
