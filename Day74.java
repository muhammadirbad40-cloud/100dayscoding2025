package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("===== MENU PERHITUNGAN =====");
            System.out.println("1. Hitung Keliling Persegi");
            System.out.println("2. Hitung Luas Lingkaran");
            System.out.println("3. Tampilkan Bilangan Genap 1-10");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = in.nextInt();

            switch (pilihan) {

                case 1 -> {
                    System.out.print("Masukkan panjang sisi: ");
                    int sisi = in.nextInt();
                    int keliling = 4 * sisi;
                    System.out.println("Keliling persegi: " + keliling);
                }

                case 2 -> {
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double r = in.nextDouble();
                    double luas = 3.14 * r * r;
                    System.out.println("Luas lingkaran: " + luas);
                }

                case 3 -> {
                    System.out.println("Bilangan genap 1-10:");
                    for (int i = 2; i <= 10; i += 2) {
                        System.out.println(i);
                    }
                }

                case 0 -> System.out.println("Program dihentikan...");

                default -> System.out.println("Pilihan tidak tersedia!");
            }

            System.out.println();  

        } while (pilihan != 0);

    }
}
