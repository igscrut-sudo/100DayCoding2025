public class Main {
	public static void main(String[] args) {
		int f = 6;
int z = 11;

System.out.println("Sebelum ditukar : f = " + f + ", z = " + z);

// Langkah-langkah penukaran
f = f + z; // f sekarang 17(6 + 11)
z = f - z; // z sekarang 5(6 - 11)

System.out.println("ditukar : f = " + f + ", z = " + z);  
	}
}
