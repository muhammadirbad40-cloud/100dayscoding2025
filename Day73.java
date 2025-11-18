package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 0;
        while (true) {
            System.out.print("Masukkan Angka(positif) : ");
            int a = in.nextInt();
            total += a;
            if (a < 0) {
                System.out.println("Harus positif :)");
                System.out.println("total : " + total);
                break;
            }

        }

    }
}
