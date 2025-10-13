package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Nilai ujian : ");
        int a = in.nextInt();
        System.out.print("Kehadiran : ");
        int b = in.nextInt();

        if (a >= 70) {
            if (b >= 8) {
                System.out.println("Selamat Anda lulus");
            } else {
                System.out.println("Nilai anda bagus tapi kehadiran anda kurang");
            }
        } else {
            System.out.println("mohon maaf anda tidak lulus");
        }

    }

}
