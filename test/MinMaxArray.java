package test;

public class MinMaxArray {

	public static void main(String[] args) {
		
	int arr[]= {1,2,3,-7,5,6,9};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max)
			max=arr[i];
		if(arr[i]<min)
			min=arr[i];
	}
		

	
	System.out.println("MAXIMUM ARRAY ELEMENT :"+ max);
	System.out.println("MINIMUM ARRAY ELEMENT :"+ min);

	}
}
