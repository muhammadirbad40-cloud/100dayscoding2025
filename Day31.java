package day31;

import java.util.Scanner;

public class Day31 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan a : ");
        int a = in.nextInt();

        boolean b = (a > 0) && (a < 10);

        System.out.println(b);

    }

}
