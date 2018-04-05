import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        if (Compare(A))
            System.out.println("Yes");
        else
            System.out.println("No");


        /* Enter your code here. Print output to STDOUT. */
    }

    public static boolean Compare(String string){
        if (string.length() <= 1){
            return true;
        }

        if (string.endsWith(Character.toString(string.charAt(0)))){
            return Compare(string.substring(1, string.length()-1));
        }
        return false;
    }

}
