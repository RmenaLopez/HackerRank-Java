import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        string = string.replaceAll("([',!?._@])+"," ");
        string = string.trim();

        String[] tokens = string.split("(\\s)+");
        if (tokens[0].equals("")){
            System.out.println(0);
            return;
        }

        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i ++){
            System.out.println(tokens[i]);
        }

    }


}
