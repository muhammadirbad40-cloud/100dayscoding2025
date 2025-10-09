package day32;

import java.util.Scanner;

public class Day32 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan a : ");
        int a = in.nextInt();
        System.out.print("Masukkan b : ");
        int b = in.nextInt();

        boolean c = (a > 0) || (b < 10);

        System.out.println(c);

    }

}
