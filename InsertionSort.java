package vinsys;

public class InsertionSort 
{
   
    public static void display(int a[])
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " "); 
        }
        System.out.println(); 
    }
    
    
    public static void insertionSort(int a[]) 
    {
        for (int i = 1; i < a.length; i++)
        {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j])
{
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
    }

    
    public static void main(String[] args) 
    {
        int a[] = {10, 7, 21, 4, 65};
        
        
        System.out.println("Given Array:");
        display(a);
        
        
        insertionSort(a);
        
        System.out.println("Sorted Array:");
        display(a);
    }
}
