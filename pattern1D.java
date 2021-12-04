public class HelloWorld{

    public static void main(String []args){
        int i;
        int N = 6;
        int j;
        for(i=1; i<=N; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(j);
            }
    
            System.out.println("");
        }
    
        // Print lower part of the pattern
        for(i=N-1; i>=1; i--)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(j);
            }
    
            System.out.println("");
        }
    }
}