package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();

        // Operator aritmatika
        int c = a + b;
        int d = a - b;

        // Operator perbandingan
        boolean e = a > b;

        // Operator logika dan modulus (cek genap)
        boolean f = (a % 2 == 0);
        boolean g = (b % 2 == 0);

        // Kombinasi operator logika
        boolean h = (a > 0 && a < 10 && b > 0 && b < 10);

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Penjumlahan: " + c);
        System.out.println("Pengurangan: " + d);
        System.out.println("Apakah a lebih besar dari b : " + e);
        System.out.println("Apakah a genap : " + f);
        System.out.println("Apakah b genap : " + g);
        System.out.println("Apakah kedua angka tersebut satuan : " + h);

    }

}
