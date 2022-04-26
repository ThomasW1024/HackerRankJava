import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println( (A.compareTo(B)) > 1? "Yes":"No");
        StringBuilder sb = new StringBuilder();
        sb.append(A.substring(0,1).toUpperCase()).append(A.substring(1)).append(" ").append(B.substring(0,1).toUpperCase()).append(B.substring(1));
        System.out.println(sb.toString());
        
    }
}
