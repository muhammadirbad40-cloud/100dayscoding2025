package Irbdd;

public class Irbdd {

    public static void main(String[] args) {

        String kalimat = "   Belajar Java Sangat Menyenangkan   ";

        System.out.println("Teks asli\t\t: '" + kalimat + "'");

        // trim()
        String tes1 = kalimat.trim();
        System.out.println("Setelah trim\t\t: '" + tes1 + "'");
        // Menghapus spasi di awal dan akhir string

        // substring()
        String tes2 = tes1.substring(0, 7);
        System.out.println("Substring (0-7)\t\t: " + tes2);
        // Mengambil karakter dari index 0 sampai 6 (7 tidak termasuk)

        // replace()
        String tes3 = tes1.replace("Java", "DDP");
        System.out.println("Replace Java -> DDP\t: " + tes3);
        // Mengganti kata Java menjadi Programming
        
    }
}
