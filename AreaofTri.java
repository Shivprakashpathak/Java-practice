import java.util.Scanner;

public class AreaofTri{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the base and height" );
        int num1  = scanner.nextInt();
        int num2 = scanner.nextInt();
        int area = (num1 * num2) /2;
        System.out.println("Area of triangle is :" + area );
    }
}
