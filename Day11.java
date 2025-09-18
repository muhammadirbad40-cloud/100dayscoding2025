package mentor;
import java.util.Scanner;
public class Mentor {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        // menerima input dari keyboard (pengenalan scanner)
        String nama, prodi;
        char gender;
        System.out.print("Nama \t: "); 
        nama = input.nextLine();
        System.out.print("Prodi \t: ");
        prodi = input.nextLine();
        System.out.println("==============");
        System.out.println("Halo,nama saya" + nama);
        System.out.println("Prodi saya " + prodi);
        System.out.println("Gender \t:");
        gender = input.next().charAt(0);
    }
    
}
