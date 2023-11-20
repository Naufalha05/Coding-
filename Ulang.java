import java.util.Scanner;
 class Ulang {
 public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Silahkan Masukkan Huruf yang Ingin dikonversikan: ");
		char huruf = sc.next().charAt(0);
		switch (huruf) {
			case 'A':
			System.out.println("Nilai Anda: 4.0");
			break;
			case 'B':
			System.out.println("Nilai Anda: 3.0");
			break;
			case 'C':
			System.out.println("Nilai Anda: 2.0");
			break;
			case 'D':
			System.out.println("Nilai Anda: 1.0");
			break;
			case 'E':
			System.out.println("Nilai Anda: 0");
			break;
			default:
			System.out.println("Maaf, konversi nilai tidak diketahui.");
			sc.close();
			}
		}
	}