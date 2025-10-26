package Irbdd;

import java.util.Scanner;

public class Irbdd2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = in.nextInt();

        String status = (umur >= 18) ? "Dewasa" : "Belum Dewasa";
        System.out.println("Status: " + status);
       
    }

}
