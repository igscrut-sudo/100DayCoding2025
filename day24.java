mport java.util.Scanner;


public class day24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double l,r;
        final double phi = 3.14;
        System.out.println("Masukkan Nilai:");
        r = sc.nextDouble();
        
        l = phi * r * r;
        System.out.println("NIlai Awal :"+r);
        System.out.println("Hasil:"+l);
        
        
        
    }
    
}
