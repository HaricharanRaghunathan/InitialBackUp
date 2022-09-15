package com.attra.TrainingAssignments_Set1;

public class LargestNumber {
	
	int[] arr;
	
	public LargestNumber(int[] arr){
		this.arr = arr;
	}
	public void mymethod() {
          
    int max = arr[0];  
      
    for (int i = 0; i < arr.length; i++) {  
      
       if(arr[i] > max)  
           max = arr[i];  
    }  
    System.out.println("Largest element present in given array: " + max);  		
	}

}
