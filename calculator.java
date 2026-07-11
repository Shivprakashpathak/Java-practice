import java.util.Scanner;
public class calculator {
public static void main(String[] args) {
double num1, num2;
char operator;
System.out.println("Shiv prakash pathak  \n22scse1040189");
Scanner input = new Scanner(System.in);
System.out.print("Enter first number: ");
num1 = input.nextDouble();
System.out.print("Enter operator: ");
operator = input.next().charAt(0);
System.out.print("Enter second number: ");
num2 = input.nextDouble();
switch(operator) {
case '+':
System.out.println(num1 + num2);
break;
case '-':
System.out.println(num1 - num2);
break;
case '*':
System.out.println(num1*num2);
break;
case '/':
System.out.println(num1 / num2);
break;
default:
System.out.println("Invalid operator");
}
}
}
