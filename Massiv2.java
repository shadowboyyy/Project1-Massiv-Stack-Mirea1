import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Короткое решение с Stream API
        int sumEven = Arrays.stream(numbers)
                           .filter(n -> n % 2 == 0)
                           .sum();
        
        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Сумма четных чисел: " + sumEven);
    }
}