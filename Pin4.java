import java.util.Scanner;

public class Pin4 {
public static void main(String[] args) {

	int PIN = 1384;
	int percobaan = 0;
	int maxPercobaan = 3;
	
	Scanner sc = new Scanner(System.in);
	while (percobaan < maxPercobaan) {
		System.out.println("Masukkan PIN Anda(4 digit): ");
	int input = sc.nextInt();
	
	if (input == PIN) {
		System.out.println("PIN anda benar. Akses diberikan.");
		break;
	} else {
		System.out.println("PIN yang anda masukkan salah. Silahkan memasukkan PIN anda kembali");
		System.out.println("Sisa kesempatan anda: "+ (maxPercobaan - percobaan - 1));
	percobaan++;
		}
	}
	
	if (percobaan == maxPercobaan) {
		System.out.println("Kesempatan anda telah habis. Akses akan diblokir");
		}
	}
}