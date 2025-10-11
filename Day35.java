package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int a = in.nextInt();

        if (a > 0 && a < 10) {
            System.out.println("angka termasuk satuan");
        } else {
            System.out.println("angka tidak termasuk satuan");
        }

    }

}
