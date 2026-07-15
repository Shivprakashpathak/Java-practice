import java.util.Scanner;

public class FloatAddition {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter first number:");
        float num1 = scanner.nextFloat();
        System.out.println("Enter second number:");
        float num2 = scanner.nextFloat();
        System.out.println("Sum"  + (num1 + num2));
    }
}