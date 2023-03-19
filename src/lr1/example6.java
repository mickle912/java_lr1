package lr1;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Surname: ");
        String surname = in.nextLine();
        System.out.println("Input Name: ");
        String name = in.nextLine();
        System.out.println("Input Patronymic: ");
        String patronymic = in.nextLine();
        System.out.println("Hello " + surname + " " + name + " " + patronymic);
        in.close();
    }
}
