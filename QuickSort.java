package vinsys;

public class QuickSort 
{
  
    public static void display(int a[])
    {
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int a[], int low, int high)
    {
        if (low < high) {
            int pi = partition(a, low, high);  
            quickSort(a, low, pi - 1);         
            quickSort(a, pi + 1, high);       
        }
    }

  
    public static int partition(int a[], int low, int high)
    {
        int pivot = a[high];  
        int i = (low - 1);    
        for (int j = low; j < high; j++)
        {
           
            if (a[j] <= pivot)
            {
                i++;
               
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

    
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;  
    }

    
    public static void main(String[] args) 
    {
        int a[] = {10, 7, 21, 4, 65};

     
        System.out.println("Given Array:");
        display(a);
        
       
        quickSort(a, 0, a.length - 1);
        
       
        System.out.println("Sorted Array:");
        display(a);
    }
}
