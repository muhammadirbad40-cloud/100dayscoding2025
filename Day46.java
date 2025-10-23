package irbdd;

import java.util.Scanner;

public class irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng      - Rp15.000");
        System.out.println("2. Mie Ayam         - Rp12.000");
        System.out.println("3. Soto Ayam        - Rp13.000");
        System.out.println("4. Bakso            - Rp10.000");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = in.nextInt();

        int total;
        switch (pilihan) {
            case 1 -> {
                total = 15000;
                System.out.println("Harga Nasi Goreng : Rp."+total);
            }
            case 2 -> {
                total = 12000;
                System.out.println("Harga Mie Ayam : Rp."+total);
            }
            case 3 -> {
                total = 13000;
                System.out.println("Harga Soto Ayam : Rp."+total);
            }
            case 4 -> {
                total = 10000;
                System.out.println("Harga Bakso : Rp."+total);
            }
            default ->
                System.out.println("Pilihan tidak valid!");
        }
       

    }

}
