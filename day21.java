public class Main {
    public static void main(String[] args) {
        int f = 6;
        int z = 11;

        System.out.println("Sebelum ditukar : f = " + f + ", z = " + z);

        // Langkah-langkah penukaran yang benar
        f = f + z; // f sekarang 17 (6 + 11)
        z = f - z; // z sekarang 6 (17 - 11)
        f = f - z; // f sekarang 11 (17 - 6) 

        System.out.println("Setelah ditukar : f = " + f + ", z = " + z);  
    }
}
