package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan perkalian : ");
        int p = in.nextInt();
        int hasil = 0;
        for (int i = 1; i <= 10; i++) {
            hasil = i * p;
            System.out.println(i + " x " + p + " : " + hasil);
        }
    }
}
