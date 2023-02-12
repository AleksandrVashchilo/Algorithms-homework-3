import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int n = 9;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = Fibonacci.fib(i + 1);
        }
        System.out.println(Arrays.toString(result));
    }
}