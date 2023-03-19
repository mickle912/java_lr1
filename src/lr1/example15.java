package lr1;

import java.util.Scanner;

public class example15 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int number1 = in.nextInt();
        System.out.println("Input second number: ");
        int number2 = in.nextInt();
        System.out.println("The sum of the numbers is: " + (number1 + number2));
        System.out.println("The difference of the numbers is: " + (number1 - number2));
        in.close();
    }
}
