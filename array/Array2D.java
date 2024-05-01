package Array;

import java.util.Scanner;

public class Array2D {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the rows :");
	 int n = sc.nextInt();
	 System.out.println("Enter the columns :");
	 int m = sc.nextInt();
	 
	 // create 2d array
	 int arr1[][]= new int [n][m];
	 System.out.println("enter values");
	 
	 // for loop for insert value in array
	 
	 //upper loop for row
	 for(int i=0;i<n;i++) {   // n =2 m=3
		 
		 
		 // lower loop for column
		 for(int j =0; j< m;j++) {
			 
			 arr1[i][j]=sc.nextInt();// a[0][0] a[0][1] a[0][2] , a[1][0]  a[1][1] a[1][2]
			 
			 
		 }
	 }
	 
	 // multideminsional  array print
	 System.out.println(" matrix are: ");
	 for(int i =0; i<n;i++) {
		  for(int j=0 ; j<m ;j++) {
			  
			   System.out.print(arr1[i][j] + " ");// a[0][0] a[0][1] a[0][2] , a[1][0]  a[1][1] a[1][2]
		  }
		  System.out.println();
	 }
	 
}
}
