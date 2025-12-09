package irbdd;

import java.util.Scanner;

public class irbdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input
        System.out.print("Masukkan angka desimal: ");
        double angka = in.nextDouble();

        // Proses pembulatan
        double ceilValue = Math.ceil(angka);
        double floorValue = Math.floor(angka);
        long roundValue = Math.round(angka);

        // Output hasil pembulatan
        System.out.println("\n=== HASIL PEMBULATAN ===");
        System.out.println("Angka asli       : " + angka);
        System.out.println("Math.ceil()  ->  : " + ceilValue + " (dibulatkan ke atas)");
        System.out.println("Math.floor() ->  : " + floorValue + " (dibulatkan ke bawah)");
        System.out.println("Math.round() ->  : " + roundValue + " (ke bilangan terdekat)");
    }
}
