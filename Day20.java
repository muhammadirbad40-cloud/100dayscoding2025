package day20;

public class Day20 {

    public static void main(String[] args) {
       
        // cara pertama 
        byte umur = 19; 
        int berat = 55;
        double tinggi = 175.5;
        boolean status = true;
        
        String a = String.valueOf(umur);
        String b = String.valueOf(berat);
        String c = String.valueOf(tinggi);
        String d = String.valueOf(status);
        
        System.out.println("byte  ->  String : " + a);
        System.out.println("Int  ->  String : " + b);
        System.out.println("Double  ->  String : " + c);
        System.out.println("boolean  ->  String : " + d);
        
        
        // cara kedua
        short umur1 = 19;
        long berat1 = 55;
        float tinggi1 = 175.5f;        
        char gender = 'L';
        
        String e = umur1 + "";
        String f = berat1 + "";
        String g = tinggi1 + "";
        String h = gender + "";
        
        System.out.println("short  ->  String : " + e);
        System.out.println("long  ->  String : " + f);
        System.out.println("float  ->  String : " + g);
        System.out.println("char  ->  String : " + h);
       
    }
    
}
