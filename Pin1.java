import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class Pin {
public static void main (String [] Ayaa) {
out.println("Silahkan Masukkan 4 Digit Pin Anda:");
Scanner key = new Scanner(System.in);
int pin = 1234;
int kesempatan = 2;
int input = key.nextInt();

if (pin == input) {
	out.println("Pin anda benar! Silahkan Masuk!");
}
while (pin != input) {
out.println("Pin yang anda masukkan salah!");
out.println("Kesempatan anda tersisa: " +kesempatan);
kesempatan--;
input = key.nextInt();
if (kesempatan == 0) {	
	out.println("Kesempatan anda telah habis, akun anda diblokir");
	break;
} 
}
}
}


