/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coding100hari;

import java.util.Scanner;
public class biodata {
     public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    
         System.out.print("Masukkan Nama =\t");
         String M = input.next();
         
         System.out.print("Masukkan Nim =\t");
         String N = input.next();
         
         System.out.print("Tanggal Lahir =\t");
         String t = input.next();
         
         System.out.print("Alamat Anda =\t");
         String a = input.next();
         
         System.out.print("Hobi Anda =\t");
         String h = input.next();
         
         System.out.println("\n\n----- Biodata -----");
         System.out.println("Nama :"+M);
         System.out.println("Nim :"+N);
         System.out.println("Tanggal Lahir :"+t);
         System.out.println("Alamat :"+a);
         System.out.println("Hobi :"+h);
   
    
    
    
}
}
