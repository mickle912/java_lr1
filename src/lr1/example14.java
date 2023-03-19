package lr1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = in.nextInt();
        int previous_number = number - 1;
        int second_number = number + 1;
        double last_number = Math.pow((number + previous_number + second_number), 2);
        System.out.println(previous_number+ " " + number + " " +
                second_number + " " + last_number);
        in.close();
    }
}
