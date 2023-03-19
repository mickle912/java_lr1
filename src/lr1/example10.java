package lr1;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input your year of birth: ");
        int year_of_birth = in.nextInt();
        int age = 2023 - year_of_birth;
        System.out.println("Your age is: " + age);
        in.close();
    }
}
