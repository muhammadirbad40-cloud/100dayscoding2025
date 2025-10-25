package Irbdd;

import java.util.Scanner;

public class Irbdd2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama: ");
        angka1 = in.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = in.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        angka2 = in.nextDouble();

        switch (operator) {
            case '+' -> {
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + (int)hasil);
            }
            case '-' -> {
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + (int)hasil);
            }
            case '*' -> {
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + (int)hasil);
            }
            case '/' -> {
                if (angka2 == 0 || angka1 == 0) {
                    System.out.println("Error: Tidak bisa dibagi dengan nol!");
                } else {
                    hasil = angka1 / angka2;
                    System.out.printf("Hasil: %.2f%n",hasil);
                }
            }
            default ->
                System.out.println("Operator tidak valid!");
        }

        System.out.println("==============================");
       
    }

}
