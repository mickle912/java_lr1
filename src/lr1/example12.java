package lr1;

import java.util.Scanner;

public class example12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = in.nextInt();
        int year_of_birth = 2023 - age;
        System.out.println("Your year of birth is: " + year_of_birth);
        in.close();
    }
}
