package Irbdd;

public class Irbdd {

    public static void main(String[] args) {

        String nama1 = "Irbad";
        String nama2 = "irbad";
        String kalimat = "Belajar Java sangat menyenangkan";
        String kosong = "";
        
        System.out.println("== equals() ==");
        System.out.println(nama1.equals(nama2));
        
        System.out.println("\n== equalsIgnoreCase() ==");
        System.out.println(nama1.equalsIgnoreCase(nama2));
        
        System.out.println("\n== contains() ==");
        System.out.println(kalimat.contains("Java"));
        
        System.out.println("\n== isEmpty() ==");
        System.out.println(kosong.isEmpty());
        
    }
}
