import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_EOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(counter + " " + sc.nextLine());
            counter++;
        }
        sc.close();
    }
}
