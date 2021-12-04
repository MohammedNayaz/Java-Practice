//Program for multiplication of array elements

public class HelloWorld{

    static int arr[] = {1, 2, 3, 4, 5, 6};
     
    // Method to calculate the
    // product of the array
    static int multiply()
    {
        int pro = 1;
        for (int i = 0; i < arr.length; i++)
            pro = pro * arr[i];
        return pro;
    }
     
    // Driver Code
    public static void main(String[] args)
    {
        // Method call to calculate product
        System.out.println(multiply());
        }
}