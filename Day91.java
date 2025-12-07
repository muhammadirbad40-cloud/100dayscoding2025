package Irbdd;

import java.util.Scanner;

public class Irbdd {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nama anda : ");
        String nama = in.nextLine();
        System.out.print("Umur anda : ");
        int umur = in.nextInt();
        
        System.out.println("\n==========\n");
        coba(nama, umur);
        System.out.println("==========");
        System.out.println(coba1(nama, umur));
    }
    
    public static void coba(String a, int b) {
        
        System.out.println(a + " berumur " + b + " tahun");
    }
    
    public static String coba1(String a, int b) {
        
        return a + " berumur " + b + " tahun";
    }
}
