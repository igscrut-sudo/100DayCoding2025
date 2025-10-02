import java.util.Scanner;


public class day25 {
    public static void main(String[] args) {
        
        int a,l,b,d;
        Scanner In = new Scanner (System.in);
   
        System.out.print("Masukkan NIlai\t:");
        a = In.nextInt();
        
        System.out.print("Masukkan NIlai\t:");
         b= In.nextInt();
        
       
        l = ++a;
        d = --b;
      
        
        System.out.println("Hasil Increment\t:"+l);
        System.out.println("Hasil Decrement\t:"+d);
       
        
        
    }
    
}
