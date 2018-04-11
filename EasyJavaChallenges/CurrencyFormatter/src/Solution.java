import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    /*
    Type: region
Subtag: CN
Description: China

Type: region
Subtag: FR
Description: France

Type: region
Subtag: US
Description: United States

Type: region
Subtag: IN
Description: India

     */


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale us = Locale.US;
        Locale china = Locale.CHINA;
        Locale france = Locale.FRANCE;
        Locale india = new Locale.Builder().setLanguage("en").setRegion("IN").build();

        NumberFormat formatter = NumberFormat.getCurrencyInstance(us);
        System.out.println("US: " + formatter.format(payment));
        formatter = NumberFormat.getCurrencyInstance(india);
        System.out.println("India: " + formatter.format(payment));
        formatter = NumberFormat.getCurrencyInstance(china);
        System.out.println("China: " + formatter.format(payment));
        formatter = NumberFormat.getCurrencyInstance(france);
        System.out.println("France: " + formatter.format(payment));

    }

}
