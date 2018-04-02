import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if ((a%2.0 != 0) || ((a%2.0 == 0) && a >= 6 && a <= 20)){
            System.out.println("Weird");
        }else
            System.out.println("Not Weird");
    }

}
