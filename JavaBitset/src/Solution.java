import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        BitSet[] bitSets = new BitSet[2];

        bitSets[0] = b1;
        bitSets[1] = b2;

        for (int i = 0; i < m; i++){
            String action = scanner.next();
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt();

            //System.out.println("Action: "+action+", x: "+x+", y: "+y);
            //System.out.println(scanner.hasNext());

            switch (action){
                case "AND":
                    bitSets[x].and(bitSets[y-1]);
                    break;

                case "OR":
                    bitSets[x].or(bitSets[y-1]);
                    break;

                case "XOR":
                    bitSets[x].xor(bitSets[y-1]);
                    break;

                case "FLIP":
                    bitSets[x].flip(y);
                    break;

                case "SET":
                    bitSets[x].set(y);
                    break;
            }

            System.out.println(b1.cardinality()+" "+b2.cardinality());

        }
    }

}
