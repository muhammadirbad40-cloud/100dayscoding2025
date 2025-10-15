package Irbdd;

import java.util.Scanner;

public class Irbdd1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int a = in.nextInt();

        if (a > 0) {
            System.out.println("Positif");
        } else if (a < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("nol");
        }

    }

}
