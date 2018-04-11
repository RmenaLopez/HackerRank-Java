import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();

        List<Integer> L = new ArrayList<>();

        for (int i = 0; i<elements; i++ ){
            L.add(scanner.nextInt());
        }

        int Q = scanner.nextInt();

        for (int i = 0; i < Q; i++){

            String action = scanner.next();

            if (action.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x,y);
            }else{
                int x = scanner.nextInt();
                L.remove(x);
            }
        }

        for (Integer i : L){
            System.out.print(i+" ");
        }

    }


}
