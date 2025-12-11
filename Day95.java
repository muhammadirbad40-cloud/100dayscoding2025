package Irbdd;
import java.util.Scanner;
public class Irbdd {
    public static void penjumlahan(int a,int b) {
        System.out.print("Hasil penjumlahan : " );
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan angka pertama : ");
        int a = in.nextInt();
        System.out.print("Masukan angka kedua : ");
        int b = in.nextInt();
        penjumlahan(a, b);
      
    }
}
