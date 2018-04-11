import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = (-9)*(7);

        for (int i = 0; i < 4; i++){
            for (int x = 0; x < 4; x++){
                int temp = arr[i+1][x+1];
                for (int j = x; j < 3; j++ ){
                    temp += arr[i][j];
                    temp += arr[i+2][j];
                }
                max = (temp > max) ? temp : max;
            }

        }

        System.out.println(max);

    }
}