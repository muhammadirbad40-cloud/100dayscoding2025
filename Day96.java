package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void operator(int a, int b) {

        double c;
        c = a + b;
        System.out.println("\nDi tambah : " + (int) c);
        c = a - b;
        System.out.println("Di kurang : " + (int) c);
        c = a * b;
        System.out.println("Di kali : " + (int) c);
        c = a / b;
        System.out.println("Di bagi : " + c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("angka pertama : ");
        int d = in.nextInt();
        System.out.print("angka kedua : ");
        int e = in.nextInt();

        operator(d, e);
    }

}
