import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        String regex ="<(.+)>([^<]+)(<\\/\\1>)";
        Pattern p = Pattern.compile(regex);

        while(testCases>0){
            String line = in.nextLine();
            Matcher matcher = p.matcher(line);

            boolean hasMatch = matcher.find();

            if (!hasMatch){
                System.out.println("None");
            }else{
                while(hasMatch){
                    System.out.println(matcher.group(2));
                    hasMatch = matcher.find();
                }
            }
            testCases--;
        }
    }

}

