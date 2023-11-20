import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class Tebakan {
public static void main (String [] args){
Scanner key = new Scanner(in);
out.println("Tebak Angka antara 1 sampai 10");
out.println("Jika benar anda berhak mendapatkan DANA");
int inputAngka = key.nextInt();
int randomAngka = new Random().nextInt(10)+1;
if (inputAngka == randomAngka) {
out.println("Selamat Anda Berhak Mendapatkan Saldo Dana Rp10.000");
}
out.println("Nyaris benar, angka yang benar adalah: " +randomAngka +".");
out.println("Ingin bermain lagi?");
key.close();
}
}
