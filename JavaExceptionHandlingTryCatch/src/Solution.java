import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try{
                System.out.println(x/y);
            }catch (ArithmeticException ae){
                System.out.println(ae);
            }

        }catch (InputMismatchException ime){
            System.out.println(ime);
        }
    }
}