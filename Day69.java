package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String user = "admin";
        int pass = 1234;

        int max = 3;
        int awal = 0;

        while (awal < max) {
            System.out.print("Username : ");
            String user1 = in.next();
            System.out.print("Password : ");
            int pass1 = in.nextInt();

            if (user1.equals(user) && pass == pass1) {
                System.out.print("\nNama anda : ");
                String a = in.next();
                System.out.println("Login berhasil. selamat datang " + a);
                return;
            } else {
                awal++;
                System.out.println("Username atau Password anda salah\n");
            }
        }
        System.out.println("Akses ditolak!");

    }
}
