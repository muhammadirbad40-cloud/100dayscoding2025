package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int n = in.nextInt();

        System.out.println("Bilangan Ganjil");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Bilangan Genap");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

}
