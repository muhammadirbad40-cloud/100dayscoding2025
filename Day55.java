package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Batas bawah : ");
        int a = in.nextInt();
        System.out.print("Batas atas : ");
        int b = in.nextInt();
        System.out.print("Angka : ");
        int c = in.nextInt();

        if (c >= a && c <= b) {
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }

        System.out.println("============");

        System.out.print("Nilai : ");
        int d = in.nextInt();

        if (d > 70) {
            System.out.println("Ujian kroco ji pale");
        } else {
            System.out.println("sa jappo'ka aih");
        }

        System.out.println("=============");

        System.out.print("angka : ");
        int e = in.nextInt();

        if (e % 2 == 0) {
            System.out.println("Iyaji");
        } else {
            System.out.println("Tidakji");
        }

    }

}
