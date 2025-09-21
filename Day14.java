package day14;

public class Day14 {

    public static void main(String[] args) {
      
        System.out.println("==Mengubah String Menjadi Tipe Data Primitif==");
        
        String nama,angka,angka1,angka2,angka3,angka4,angka5,huruf;
        
        nama = "muhammad irbad saadilah";
        
        angka = "19";
        byte umur = Byte.parseByte(angka);
        
        angka1 = "09";
        short tanggal = Short.parseShort(angka1);
        
        angka2 = "2006";
        int tahun = Integer.parseInt(angka2);  

        angka3 = "6281543351923";
        long wa = Long.parseLong(angka3); 
        
        angka4 = "45.5";
        float berat = Float.parseFloat(angka4);

        angka5 = "175.5";
        double tinggi = Double.parseDouble(angka5);  

        String sehat = "true";
        boolean kata = Boolean.parseBoolean(sehat);
        /*
        cara mengubah string menjadi tipe data primitif 
        yaitu dengan menggunakan seperti 
        contoh -> tipedata.parsexxx(namavariable);
        kemudian "xxx" itu diisi dengan tipe data yg kita gunakan 
        cara ini agak mirip dengan yg kita gunakan di sistem Scanner
        */
        huruf = "L";
        char gender = huruf.charAt(0); 
        /* 
        khusus untuk tipe data char di sini kita bisa langsung memasukkan 
        nama variable tanpa harus menebutkan tipe data nya seperti contoh di atas
        */
        
        System.out.println("\nBIODATA MAHASISWA");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Umur \t\t: " + umur);  
        System.out.println("TTL \t\t: Majene " + tanggal + "Juni" + tahun);
        System.out.println("Berat Badan \t: " + berat);
        System.out.println("Tinggi Badan \t: " + tinggi);
        System.out.println("Nomor wa \t: +" + wa);
        System.out.println("Gender \t\t: " + gender); 
        System.out.println("Sehat \t\t: " + kata);
    }
    
}
