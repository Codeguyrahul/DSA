package Array;

public class Minmum_Value {
	
	public static int findMinimum(int []arr){
		if(arr ==null || arr.length== 0) {
			
			throw new IllegalArgumentException("invalid input");
			
		}
		
		int min =arr[0];
		for(int i =1; i<arr.length;i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		return min;
		
	}
	
//	public static void printArray( int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		} System.out.println();
//		
//	}
public static void main(String[] args) {
	int arr[]= {5,9,3,15,1,2};
	 Minmum_Value mn= new  Minmum_Value();
	
	
//	printArray(arr);
	System.out.println(mn.findMinimum(arr));
	

	
	
}
}
