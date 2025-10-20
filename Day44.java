package irbdd;

import java.util.Scanner;

public class irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai (0 - 100) : ");
        int a = in.nextInt();

        if (a >= 85 && a <= 100) {
            System.out.println("Grade A");
        } else if (a >= 75 && a <= 85) {
            System.out.println("Grade B");
        } else if (a >= 60 && a <= 75) {
            System.out.println("Grade C");
        } else if (a >= 40 && a <= 60) {
            System.out.println("Grade D");
        } else if (a >= 0 && a <= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Nilai Tidak Valid!!");

        }

    }

}
