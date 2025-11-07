package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int n = in.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println("\nJumlah 1-n adalah : " + total);
    }

}
