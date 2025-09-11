package escapesequence;


public class EscapeSequence {


    public static void main(String[] args) {
    /*Escape Sequence memiliki beberapa kode yaitu: 
(\n ,\t,\b,\r, \\, \', \", \ ), 
kode tersebut memiliki fungsi yang berbeda beda contohnya sbb:*/

    // (\n)berfungsi untuk memindahkan teks dibaris didepan kode atau sama dengan enter
        System.out.println("instagram \n mhmd_irbd");
        
    // ((\t) berfungsi ini sama seperti tab, bisa untuk merapikan teks     
        System.out.println("ig\t: mhmd_irbd");
    
    //( \b) berfungsi untuk menghilangkan 1 karakter di belakang kode   
        System.out.println("hellow\b world ");
    
    // (\r) berfungsi untuk menghilangkan teks dibelakang kode
        System.out.println("saya sedang \rmakan ");
        
    // (\\) berfungsi untuk menampilkan 1 backslash di teks
        System.out.println("saya\\berasal\\dari ");
        
    // (\') berfungsi untuk menampilkan 1 tanda (') di kata
        System.out.println("petik satu \'contoh\'");
        
    // (\") berfungsi untuk menampilkan 2 tanda (") di kata    
        System.out.println("petik dua \"contoh\"");
        
    /* (\) berfungsi jika kita menggunakan kode unicode  
        untuk mengetahui kode unicode kita bisa lihat di goggle dll.
        cara penggunaannya yaitu: \kode unicode.
        */ 
        System.out.println("\u0069\u0072\u0062\u0061\u0064");
    }
    
}
