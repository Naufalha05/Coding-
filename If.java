import java.util.Scanner;
 class If {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Silahkan Masukkan Huruf yang Ingin dikonversikan: ");
		char huruf = sc.next().charAt(0);
		if (huruf == 'A') {
			System.out.println("Nilai Anda: 4.0");
		} else if (huruf == 'B') {
			System.out.println("Nilai Anda: 3.0");
		} else if (huruf == 'C') {
			System.out.println("Nilai Anda: 2.0");
		} else if (huruf == 'D') {
			System.out.println("Nilai Anda: 1.0");
		} else if (huruf == 'E') {
			System.out.println("Nilai Anda: 0");
		} else {
			System.out.println("Maaf, konversi nilai tidak diketahui.");
			sc.close();
 }
 }
 }