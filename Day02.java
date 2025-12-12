package printlnprintprintf;

public class PrintlnPrintPrintf {

    public static void main(String[] args) {
        //tipe data yang digunakan dan nama variabel//
   String nama;
   int umur;
   double tb;
   
   //Deklarasi//
    nama = "Muhammad Irbad Saadilah";
    umur = 19;
    tb = 175.0;
    
    //Untuk penggunaan "println" mencetak agar otomatis pindah dibaris baru//
        System.out.println("ig mhmd_irbd");
        
    //untuk penggunaan "print" mencetak teks agar tanpa pindah baris//
        System.out.print("perkenalkan");
        
    /*Untuk penggunaan "printf" mencetak teks dengan format
        %s = String
        %d = byte, short, int, long
        %.2f = float dan double 
        (untuk menampilkan 2 angka dibelakang koma pakai " %.2.f "
         umtuk menampilkan banyak angka dibelakang koma pakai " %f " */
        System.out.printf(" nama saya : %s ,umur : %dtahun ,Tinggi Badan : %.2f ",nama, umur, tb); 
       
    }
    
}
