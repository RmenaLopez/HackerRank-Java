import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i ++){
            arr[i] = scanner.nextInt();
        }

        int count = 0;


        for (int start = 0; start < n; start++){
            int end = start;
            int suma = 0;
            do {
                suma += arr[end];
                System.out.println(suma);
                if (suma < 0){
                    count++;
                }
                end++;
            } while(end < n);
        }
        System.out.println(count);
    }
}