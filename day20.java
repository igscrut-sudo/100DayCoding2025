/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coding100hari;


public class day20 {
    public static void main(String[] args) {
        
        int h = 2243;
        byte a = 12;
        long b = 13;
        short c = 25;
        double d = 22;
        char e = 'A';
        float f =(float) 267;
        boolean g = true;
        
        System.out.println("=== Mengubah Tipe Data Primitif ke String ===");
        
        String str = String.valueOf("int\t:"+h);
        System.out.println(str);
        
        String str1 = String.valueOf("byte\t:"+a);
        System.out.println(str1);
        
        String str2 = long.toString("long\t:"+b);
        System.out.println(str2);
        
        String str3 = short.toString("short\t:"+c);
        System.out.println(str3);
        
        String str4 = double.toString("double\t:"+d);
        System.out.println(str4);
        
        String str5 = String.valueOf("char\t:"+e);
        System.out.println(str5);
        
        String str6 = f+"";
        System.out.println(str6);
        
        String str51 = String.valueOf("Boolean\t:"+g);
        System.out.println(str51);
        
    }
    
}
