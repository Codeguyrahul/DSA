package Array;

import java.util.Scanner;

public class Insert_new_Element {
public static void main(String[] args) {
	
	
	 int n ; 
	 Scanner sc = new Scanner(System.in);
	 
	 // define array of size
	 System.out.println(" enter the Array size:");
	 n =sc.nextInt();
	 
	 
	//  array creation and  add(insert) the element 
	 int arr1[]= new int[n];
	 
	 System.out.println("enter the value:");
	 
	 for(int i=0; i< n;i++) {
		 arr1[i] = sc.nextInt();
	 }
	 
	 
	 // print the array
	 System.out.println("elements are:");
	 
	 for(int i =0; i<n;i++) {
		 System.out.print(arr1[i]+ " ");
	 }
	 System.out.println( );
	 
	 
	 //--------------------
	 
	 // create new array
	 int arr2 []= new int[n+1];
	 
	 // enter the index(M) no where u want to insert element
	 System.out.println("enter the index no:");
	 int m= sc.nextInt();
	 
	 // enter element 
	  System.out.println("Enter the value to be inserted:");
	  int p =sc.nextInt();
	  
	  // for loop , for insert the element from previous array = arr1
	  for(int i =0; i<n+1;i++) {	
		  
		  // insert(copy) as it is element from arr1 until the index position less then m 
		  if(i<m) {
			  arr2[i]=arr1[i];
		  }
		  
		  //m is index no , p is new element ,i(index ) equal to m(index position same) than insert the new value in arr2;  
		  else if(i==m) {
		           arr2[i]=p;
		   }
		  
		 // arr1 = 10  20 30 40 50    || arr2[i] = arr1[i-1] i is index of array.
		  //arr2 = 10  20 80 30 40 50
		  else { 
			  arr2[i]=arr1[i-1];
		  }
		  
		  
		  }
	 
	 
	 // print new array = arr2
	 System.out.println("elements are:");
	 
	 for(int i =0; i<n+1;i++) {
		 System.out.print(arr2[i]+ " ");
	 }
	 
}
}
