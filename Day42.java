package Irbdd;

import java.util.Scanner;

public class Irbdd1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       int b,c,d,e,f;
        System.out.print("Nama Karyawan   : ");
        String a = in.nextLine();
        System.out.print("Gaji Pokok     : ");
        b = in.nextInt();
        System.out.print("Potongan pajak : ");
        c = in.nextInt();
        System.out.print("Potongan Bank  : ");
        d = in.nextInt();
        
        f = c + d;
        e = b - f;
        System.out.println("======================");
        System.out.println("Nama karyawan : "+a);
        System.out.println("Gaji kotor : "+b);
        System.out.println("Potongan Gaji : "+f);
        System.out.println("Gaji Bersih : "+e);
        
    }

}
