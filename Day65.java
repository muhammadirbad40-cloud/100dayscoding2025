package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===MENENTUKAN KELIPATAN===");
        System.out.print("Masukkan angka : ");
        int n = in.nextInt();

        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println("kelipatan " + n + " adalah : " + total);
    }

}
