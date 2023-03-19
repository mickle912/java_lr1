package lr1;

import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Name: ");
        String name = in.nextLine();
        System.out.println("Input Age: ");
        int age = in.nextInt();
        System.out.println("Your name is : " + name);
        System.out.println("Your age is : " + age);
        in.close();
    }
}
