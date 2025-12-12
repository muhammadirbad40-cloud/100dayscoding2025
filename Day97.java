package soal2;

import java.util.Scanner;

public class Soal2 {

    public static void persegi(int s) {

        int L;

        L = s * s;

        System.out.println("\nLuas = Sisi x Sisi");
        System.out.println("Luas = " + s + " x " + s + " = " + L);
        System.out.println("Luas Persegi = " + L);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sisi : ");
        int a = in.nextInt();

        persegi(a);
    }

}
