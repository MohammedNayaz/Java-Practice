import java.util.*;
import java.lang.*;
import java.io.*;
public class HelloWorld{

static int countSubstr(String str, int n,
                       char x, char y)
{
    int tot_count = 0;
    int count_x = 0;
 
    for (int i = 0; i < n; i++)
    {
 
        // if true, increment 'count_x'
        if (str.charAt(i) == x)
            count_x++;
 
        // if true accumulate 'count_x'
        // to 'tot_count'
        if (str.charAt(i) == y)
            tot_count += count_x;
    }
 
    // required count
    return tot_count;
}
 
// Driver code
public static void main(String args[])
{
    String str = "abc";
    //String str = "abbcaceghcak";

    int n = str.length();
    char x = 'a', y = 'c';
 
    System.out.print ("Count = " +
       countSubstr(str, n, x, y));
}
}
 