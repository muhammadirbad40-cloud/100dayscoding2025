package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static int persegi(int s) {

        int L;
        L = s * s;

        System.out.println("\nLuas = Sisi x Sisi");
        System.out.println("Luas = " + s + " x " + s + " = " + L);
        System.out.println("Luas Persegi = " + L);
        
        return L;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sisi : ");
        int a = in.nextInt();

        persegi(a);
    }

}
