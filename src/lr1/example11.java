package lr1;

import java.util.Scanner;

public class example11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();
        System.out.println("Input your year of birth: ");
        int year_of_birth = in.nextInt();
        int age = 2023 - year_of_birth;
        System.out.println(name + " ,your age is: " + age);
        in.close();
    }
}
