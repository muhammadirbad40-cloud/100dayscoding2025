package day6;

public class Day6 {

    public static void main(String[] args) {
     //    TIPE DATA UNTUK BILANGAN DESIMAL
     
     //  float  -> untuk bilangan pecahan(desimal),dengan ukuran 32 bit.
     // untuk cara pemangilan float itu ada dua seperti contoh di bawah
     
       float angka, angka1;
       
       angka  =(float)9.87654;
       angka1 =9.98765f;
       
     // untuk cara pertama di depan angkanya kita taruh kata float beserta tanda kurung ().        
     // untuk cara kedua kita cukup menaruh huruf "f" di belakangnya.  
       
     //  double  -> untuk bilangan pecahan(desimal) yang lebih besar dari float dengan ukuran 64 bit.
       
       double angka2 = 1.23987465;
       
        System.out.println(angka);
        System.out.println(angka1);
        System.out.println(angka2);
    }
    
}
