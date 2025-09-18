
package sanner;
import java.util.Scanner;
public class Sanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String n,k;
        String nim;
        
        System.out.print("Masukkan Nama Anda :");
         n = input.next();
        
        System.out.print("Masukkan Nim :");
        nim = input.next();
        
        System.out.print("Masukkan Kelas:");
        k = input.next();
        
        
        System.out.println("\n---- Data Diri ----");
        System.out.println("Nama :"+ n);
        System.out.println("Nim :"+ nim);
        System.out.println("Kelas :"+k);
        
        
       
        
    }
    
}
