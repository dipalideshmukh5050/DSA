package vinsys;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[];
		arr=new int [10];
		boolean flag=false;
		System.out.println("Enter the array elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
			System.out.println("Enter the element to search");
			int s=sc.nextInt();
			for(int i=0;i<arr.length;i++)
			{
				if(s==arr[i])
				{
					System.out.println("Element found at posion "+i);
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				System.out.println("Element not found");
			}

	}

}

/*
public class LinearSearch{

   
    public static int linearSearch(int[] arr, int target) {
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
       
        int[] array = {22, 14, 3, 6, 17, 19};

       
        int target = 6;

     
        int result = linearSearch(array, target);

      
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
*/
