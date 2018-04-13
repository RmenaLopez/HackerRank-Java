import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        s = Arrays.copyOfRange(s, 0, n);

        Comparator<String> decimalComparator = (o1, o2) -> {
            BigDecimal firstNumber = new BigDecimal(o1);
            BigDecimal secondNumber = new BigDecimal(o2);

            return secondNumber.compareTo(firstNumber);
        };

        Arrays.sort(s,decimalComparator);


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}