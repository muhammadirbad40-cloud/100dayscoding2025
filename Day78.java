package Irbdd;

import java.util.Scanner;

public class Irbdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String kalimat = in.nextLine();
        String nama = "Muhammad Irbad";
        
        System.out.println("\njumlah karakter : "+kalimat.length());
        System.out.println("ToUpperCase : "+kalimat.toUpperCase());
        System.out.println("ToLowerCase : "+kalimat.toLowerCase());
        System.out.println("Equals : "+kalimat.equals(nama));
        System.out.println("equalsIgnoreCase : "+kalimat.equalsIgnoreCase(nama));
        System.out.println("Contains : "+kalimat.contains("Irbad"));
        System.out.println("IsEmpty : "+kalimat.isEmpty());
        System.out.println("IsEmpty : "+kalimat.isEmpty());

    }
}
