package lr1;
import java.util.Scanner;

public class example8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input current day of the week: ");
        String week_day = in.nextLine();
        System.out.println("Input month: ");
        String month = in.nextLine();
        System.out.println("Input date: ");
        int date = in.nextInt();
        System.out.println("Today is " + week_day +"\n" + date + " " + month);
        in.close();
    }
}
