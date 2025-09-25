/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coding100hari;

public class day18 {

    public static void main(String[] args) {
        String[] a = {"a,", "b,", "c,", "d,", "e"};
        char[] h = {'a', 'b', 'c', 'd', 'e'};
        int[] b = {1,2,3,4,5};
       
       

        // Cara 2: Enhanced for loop
        System.out.print("Type Data Keci Ke Besar\t:");
        for (String huruf : a) {
            System.out.print(huruf);
        }
        System.out.println("");
        System.out.print("Type Data Keci Ke Besar Chart\t:");
        for (char ll : h) {
            System.out.print(ll);
        }
        System.out.println("");
        System.out.println("Type Data Keci Ke Besar\t:");
        for (int aa : b) {
            System.out.print(aa);
      
        }

    }

}
