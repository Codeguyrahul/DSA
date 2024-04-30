package Array;

public class Array {
	public void printArray( int []arr) {
		 int n = arr.length;
		 for(int i =0; i<n;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
		
	}
 public static void main(String[] args) {
	Array a = new Array();
	a.printArray( new int [] {4,3,6,8,2});
	
	
}
}
