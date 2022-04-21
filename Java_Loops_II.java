import java.util.*;
import java.io.*;

class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double prev = 0;
            for (int j=0 ; j <n ; j+=1){
                prev += Math.pow(2,j)*b;
                System.out.printf("%.0f", a+prev);
                if (j != j-1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        in.close();
    }
}
