import java.util.Scanner;

public class Java_Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "z";
        String largest = "A";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; i+k<=s.length(); i+=1){
            String ss = s.substring(i, i+k);
            if (ss.compareTo(smallest) < 0){
                smallest = ss;
            }
            if (ss.compareTo(largest) > 0 ){
                largest = ss;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
