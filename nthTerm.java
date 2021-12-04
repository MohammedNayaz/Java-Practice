//Program to find Nth term in the given Series

public class HelloWorld{

    static void findNthTerm(int n)
{
    // If input number is even
    if (n % 2 == 0)
    {
        n = n / 2;
        System.out.print(Math.pow(3, n - 1) + "\n");
    }
    // If input number is odd
    else
    {
        n = (n / 2) + 1;
        System.out.print(Math.pow(2, n - 1) + "\n");
    }
}
 
// Driver Code
public static void main(String[] args)
{
    int N = 4;
    findNthTerm(N);
 
    N = 11;
    findNthTerm(N);
 
}
}