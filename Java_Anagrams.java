import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;
        int[] arrA = a.toLowerCase().chars().parallel().sorted().toArray();
        int[] arrB = b.toLowerCase().chars().parallel().sorted().toArray();
        for(int i=0; i < a.length(); i +=1){
            if (arrA[i] != arrB[i]) return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
