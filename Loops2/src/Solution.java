import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String result = "";

            for (int j = 0; j < n; j++){

                a += (int)(Math.pow(2, j)*b);

                result += Integer.toString(a) + " ";
            }
            System.out.println(result.trim());
        }
        in.close();
    }
}
