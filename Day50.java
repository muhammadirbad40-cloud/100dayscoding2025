package Irbdd;

import java.util.Scanner;

public class Irbdd2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int a = in.nextInt();

        String ket = (a % 2 == 0) ? "genap " : " ganjil";
        System.out.println(a +" = "+ ket);
       
    }

}
