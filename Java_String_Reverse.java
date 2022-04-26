import java.io.*;
import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rA = new StringBuilder(A).reverse().toString();
        System.out.println( A.equals(rA) ? "Yes": "No");
        sc.close();
    }
}
