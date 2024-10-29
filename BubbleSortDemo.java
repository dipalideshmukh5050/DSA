package vinsys;

public class BubbleSortDemo 
{
    
    public static void display(int a[]) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " "); 
        }
        System.out.println(); 
    }

    
    public static void bubbleSort(int a[]) 
    {
        for (int i = 0; i < a.length - 1; i++) 
        {
            for (int j = 0; j < a.length - i - 1; j++) 
            {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    
    public static void main(String[] args) 
    {
        int a[] = {20, 40, 30, 10, 50, 60};

        
        System.out.println("Given Array:");
        display(a);

       
        bubbleSort(a);

        
        System.out.println("Sorted Array:");
        display(a);
    }
}
