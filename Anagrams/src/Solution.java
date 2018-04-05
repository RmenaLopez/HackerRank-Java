import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static boolean isAnagram(String a, String b){

        if (a.length() != b.length()){
            return false;
        }
        if (a.length() == 0){
            return true;
        }
        return isAnagram(a.replaceAll("(?i)"+Character.toString(a.charAt(0)), ""), b.replaceAll("(?i)"+Character.toString(a.charAt(0)), "") );
    }
}
