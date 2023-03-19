package timus;

import java.util.Arrays;
import java.util.Scanner;

public class timus1293 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        String line = in.nextLine();
        String[] vars  = line.split(" ");
        int thorium_sulfide = 1;
        for (String var: vars){
            int temp = Integer.parseInt(var);
            thorium_sulfide *= temp;
        }
        System.out.println(thorium_sulfide * 2);
        in.close();
    }
}
