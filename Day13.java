package evaluasi1;
import java.util.Scanner;
public class Evaluasi1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Selamat Datang Di Program Evaluasi Java====");
        
        String nama,nim,hobi;
        int usia;
        float tinggi;
        boolean status;
        
        System.out.print("Nama \t\t: ");
        nama = input.nextLine();
        System.out.print("NIM \t\t: ");
        nim = input.nextLine();
        System.out.print("Umur \t\t: ");
        usia = input.nextInt();
        System.out.print("Tinggi Badan \t: ");
        tinggi = input.nextFloat();
        input.nextLine();
        System.out.print("Hobi \t\t: ");
        hobi = input.nextLine();
        System.out.print("Status Mahasiswa : ");
        status = input.nextBoolean();
        
        long tabunganAwal,tambahan,pengeluaran,total,sisaTabungan;
         tabunganAwal = 1000000;
         tambahan = 500000;
         pengeluaran =200000;
         total = tabunganAwal + tambahan;
         sisaTabungan = total - pengeluaran;
         
         System.out.println("\nTotal Tabungan : Rp." + total);
         System.out.println("Jadi Sisa Tabungan Adalah : Rp." + sisaTabungan);
         
         
         final double phi = 3.14159;
         double L;
         float r;
         
         System.out.print("\nMasukkan Jari-Jari : ");
         r = input.nextFloat();
         
         L = phi * r * r;
         System.out.println("Luas Lingkaran = " + L);
         
         
         System.out.println("\n===BIODATA MAHASISWA===");
         System.out.println("Nama Lengkap \t: " + nama);
         System.out.println("NIM \t\t: " + nim);
         System.out.println("Usia \t\t: " + usia + " Tahun");
         System.out.println("Tinggi Badan \t: " + tinggi + "cm");
         System.out.println("Hobi \t\t: " + hobi);
         System.out.println("Status \t\t: " + status);
         System.out.println("Tabungan \t: " + sisaTabungan);
         System.out.printf("Luas Lingkaran :%.2f  ", L); 
         
    }
    
}
