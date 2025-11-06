package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int n = in.nextInt();
        System.out.print("Masukkan M : ");
        int m = in.nextInt();

        System.out.println("Kelipatan "+m+" dari "+n+" adalah : ");
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
    }

}
