public class Add {
    public void add(int... numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length-1; i++){
            sum += numbers[i];
            System.out.print(numbers[i]+"+");
        }
        sum += numbers[numbers.length-1];
        System.out.println(numbers[numbers.length-1]+"="+sum);
    }
}
