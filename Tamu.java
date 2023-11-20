   import static  java.lang.System.out;
   import java.util.Scanner;
   import java.util.Random;
   
	class Tamu {
	public static void main(String [] args) {
	Scanner key = new Scanner(System.in);
	out.print("Masukkan angka dari 1 hingga 10");
	int inputAngka = key.nextInt();
	int randomAngka = new Random().nextInt(10) + 1;
	if (inputAngka == randomAngka) {
	out.println("************");
	out.println("Kamu Menang");
	out.println("************");
	} else {
	out.println("Kamu Kalah");
	out.println("Angka Randomnya adalah " +randomAngka+".");
	}
	out.println("Terima Kasih Sudah Bermain");
	key.close();
	}
	}
	
	