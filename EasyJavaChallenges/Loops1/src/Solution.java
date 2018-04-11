import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(x + " " + "x " + i + " = " + x*i);
        }
    }
}
