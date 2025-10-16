package Irbdd;

import java.util.Scanner;

public class Irbdd1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MENU KAFE ===");
        System.out.println("1. Kopi Hitam - Rp 10.000");
        System.out.println("2. Teh Manis  - Rp 8.000");
        System.out.println("3. Coklat Panas - Rp 12.000");
        System.out.println("4. Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu (1-4): ");

        int pilihan = in.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Kopi Hitam. Total bayar: Rp 10.000");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Teh Manis. Total bayar: Rp 8.000");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Coklat Panas. Total bayar: Rp 12.000");
        } else if (pilihan == 4) {
            System.out.println("Terima kasih telah berkunjung!");
        } else {
            System.out.println("Pilihan tidak tersedia!");
        }

    }

}
