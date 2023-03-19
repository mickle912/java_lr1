package lr1;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input month: ");
        String month = in.nextLine();
        System.out.println("Input amount of days: ");
        int amount = in.nextInt();
        System.out.println(month + " has " + amount + " days!");
        in.close();
    }
}
