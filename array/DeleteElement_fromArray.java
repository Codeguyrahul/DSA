package Array;

import java.util.Scanner;

public class DeleteElement_fromArray {
public static void main(String[] args) {
	int n ;
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the array of size:");
	n = sc.nextInt();
	
	int arr1[]= new int[n];
	 System.out.println(" enter the value");
	  for(int i =0;i<n;i++) {
		  arr1[i]= sc.nextInt();
		  
	  }
	  
	  System.out.println(" array are:");
	  for(int i =0 ; i<n;i++) {
		  System.out.print(arr1[i]+ " ");
	  }
	  
	  //---------------------------------
	  // delete element from array
	  // create another array
	   int  arr2[] = new int[n-1];
	    
	   System.out.println(" enter the index:");
	   int m = sc.nextInt();
	   
	   for(int i =0;i<arr1.length;i++) {
		   if(i<m) {
			   arr2[i]= arr1[i];
		   }
		   else if(i==m) {
			   continue;
		   }
		   //arr1[]=   10 20 30 40 50  , i is index 
		   // arr2[] = 10 20 40 50     , i is index and after 30 its become [ i -1 ]
		   else
		   {
			   arr2[i-1]=arr1[i];
		   }
	   }
	   
	   for(int i =0;i< n-1;i++) {
		   System.out.print(arr2[i] +" ");
	   }
	   
	  
}
}
