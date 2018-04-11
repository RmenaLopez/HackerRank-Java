import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) throws ClassNotFoundException {


        Class student = Class.forName("Student");
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i = 0; i < methods.length; i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }

    }

}
