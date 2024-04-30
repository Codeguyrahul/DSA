package Array;

public class ArrayUtil {
	

	// this function is used to print the array and store the value of  ""myArray from arrayDemo".
	public void printArray( int[] arr) {
		int n = arr.length;
		for(int i =0; i <n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	
	// create and initialize of array
	public void arrayDemo() {
		 int []myArray = new int[5];
		 myArray[0]=6;
		 myArray[1]=7;
		 myArray[2]=89;
		 myArray[3]=43;
		 myArray[4]=1;
		 
		 // call printArray  and pass myArray;
		 printArray(myArray);
		 
	}
	
	
	
	
	public static void main(String[] args) {
		
		//create class obj
		ArrayUtil Au = new ArrayUtil();
		// and call the arraydemo function
		Au.arrayDemo();
	}
}
