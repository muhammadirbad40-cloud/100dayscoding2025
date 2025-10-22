package irbdd;

import java.util.Scanner;

public class irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Bus");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = in.nextInt();

        int tarif;

        switch (pilihan) {
            case 1 -> {
                tarif = 5000;
                System.out.println("Tarif parkir motor = Rp " + tarif);
            }
            case 2 -> {
                tarif = 10000;
                System.out.println("Tarif parkir mobil = Rp " + tarif);
            }
            case 3 -> {
                tarif = 20000;
                System.out.println("Tarif parkir bus = Rp " + tarif);
            }
            default ->
                System.out.println("Jenis kendaraan tidak dikenal!");
        }
    }
}
