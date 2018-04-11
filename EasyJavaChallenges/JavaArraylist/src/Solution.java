import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList> data = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            ArrayList<Integer> column = new ArrayList<>();
            int numbersInLine = scanner.nextInt();
            for (int j = 0; j < numbersInLine; j++){
                int numberToAdd = scanner.nextInt();
                column.add(numberToAdd);
            }
            data.add(column);
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            int line = scanner.nextInt();
            int pos = scanner.nextInt();
            try{
                System.out.println(data.get(line-1).get(pos-1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}