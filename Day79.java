package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== Buat Akun Baru ===");
        System.out.print("Masukkan Username: ");
        String username = in.nextLine();
        System.out.print("Masukkan Password: ");
        String password = in.nextLine();

        System.out.println("\nAkun berhasil dibuat! Silakan login.\n");

        String userLogin, passLogin;

        do {
            System.out.print("Username: ");
            userLogin = in.nextLine();
            System.out.print("Password: ");
            passLogin = in.nextLine();

            if (!userLogin.equals(username) || !passLogin.equals(password)) {
                System.out.println("Login gagal! Username atau password salah.\nCoba lagi.\n");
            }

        } while (!userLogin.equals(username) || !passLogin.equals(password));

        System.out.println("\nLogin berhasil! Selamat datang, " + username + "!");

    }
}
