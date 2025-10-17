package Irbdd;

import java.util.Scanner;

public class Irbdd1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        angka1 = in.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = in.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = in.nextDouble();

        // Logika menggunakan if
        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + (int) hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + (int) hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + (int) hasil);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.printf("Hasil:%.2f ",hasil);
            } else {
                System.err.println("Error: Tidak bisa dibagi dengan nol!");
            }
        } else {
            System.out.println("Operator tidak dikenal!");
        }

    }

}
