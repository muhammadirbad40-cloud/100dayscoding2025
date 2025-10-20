package irbdd;

import java.util.Scanner;

public class irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int a = in.nextInt();

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println(a + " Kelipatan 3 dan 5");
        } else if (a % 3 == 0) {
            System.out.println(a + " Kelipatan 3");
        } else if (a % 5 == 0) {
            System.out.println(a + " Kelipatan 5");
        } else {
            System.out.println(a + " tidak kelipatan 3 dan 5");

        }

    }

}
