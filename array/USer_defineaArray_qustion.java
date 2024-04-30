package Array;

import java.util.Scanner;

public class USer_defineaArray_qustion {
 public static void main(String[] args) {
	 
	 int n ; 
	 Scanner sc = new Scanner(System.in);
	 
	 // define array of size
	 System.out.println(" enter the Array size:");
	 n =sc.nextInt();
	 
	 
	//  array creation and  add(insert) the element 
	 int arr[]= new int[n];
	 
	 System.out.println("enter the value:");
	 
	 for(int i=0; i< n;i++) {
		 arr[i] = sc.nextInt();
	 }
	 
	 
	 // print the array
	 System.out.println("elements are:");
	 
	 for(int i =0; i<n;i++) {
		 System.out.print(arr[i]+ " ");
	 }
	 
 }}
