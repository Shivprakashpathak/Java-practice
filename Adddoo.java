import java.util.Scanner;
public class Adddoo {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println ("enter the no.");
        int FirstNum = input.nextInt();
        System.out.println("Enter Second No.");
        int SecondNum = input.nextInt();
        int sum = FirstNum + SecondNum;
        System.out.println (sum);
    }
}