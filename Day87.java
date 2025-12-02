package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nilai = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.print("Masukkan Angka yang di cari : ");
        int cari = in.nextInt();

        boolean dapat = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                dapat = true;
                System.out.println("Angka ditemukan di indeks ke-" + i);
                break;
            }
        }

        if (!dapat) {
            System.out.println("Angka tidak di temukan.");
        }

    }
}
