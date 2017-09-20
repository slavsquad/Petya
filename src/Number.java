import java.util.*;

public class Number {
    public static int sum(int n){
        String number = String.valueOf(n);
        int sum = 0;
        for (int i=0;i<=number.length()-1;i++){
            sum+=Character.getNumericValue(number.charAt(i));
        }
        return sum;
    }
    public static void main(String[] args) {
        Set<Double> arr = new HashSet<>();
        for (int k=1;k<10000;k++){
            double n = (double) k/sum(k);
            if (Math.IEEEremainder(n,(int)n)==0){
                arr.add(Double.valueOf(n));
            }
        }

        List qwerty = new ArrayList(arr);
        Collections.sort(qwerty);

        System.out.println(qwerty);
    }
}
