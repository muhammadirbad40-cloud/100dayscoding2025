package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void cetakNama(String nama) {

        System.out.println("\nNama kamu adalah : " + nama);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nm = in.nextLine();

        cetakNama(nm);
    }

}
