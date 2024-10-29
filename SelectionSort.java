package vinsys;

public class SelectionSort 
{
	public static void display(int a[])
	{
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int a[]) 
    {
    	int min;
    	for (int i = 0; i < a.length - 1; i++)
    	{
    		min = i;
    		for (int j = i + 1; j < a.length; j++) 
            {
    			if (a[j] < a[min]) 
                {
    				min = j;
                }
            }
    		int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            
            if (i == 0)
            {
                System.out.print("Iteration : ");
                display(a);
            }
        }
    }

    public static void main(String[] args) 
    {
        int a[] = {20, 40, 30, 10, 50, 60};

        selectionSort(a);
        System.out.println("Sorted array:");
        display(a);
    }
}
