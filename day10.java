public class Coding100hari {
// Konstanta class level (static final)
    public static final double PI = 3.14159;
    public static final String NAMA_APLIKASI = "Aplikasi Saya Coding Cloud";
   
	public static void main(String[] args) {

   
        // Konstanta method level (final)
        final int UMUR_MINIMAL = 18;
        final String PESAN_SELAMAT = "Selamat datang!";
        
        System.out.println("Nilai PI: " + PI);
        System.out.println("Nama Aplikasi: " + NAMA_APLIKASI);
        System.out.println("Umur Minimal: " + UMUR_MINIMAL);
        System.out.println("Pesan: " + PESAN_SELAMAT);
        
        // Error jika mencoba mengubah nilai konstanta
        // UMUR_MINIMAL = 20; // Akan menyebabkan error kompilasi
    }
}
