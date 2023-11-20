import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class Re {
public static void main (String [] Ayaa) {
Scanner key = new Scanner(System.in);
 int angka = 0;
 int tebak = new Random().nextInt(10) + 1;
 out.println("_____________");
 out.println("Gacha tebak angka, menang dapat aku");
 out.println("_____________");
 out.println("Masukin angka 1 sampai 10");
 int inputNumber = key.nextInt();
 angka++;
 
 while (inputNumber!=tebak) {
 out.println("Salah kocak");
 out.println("Maen lagi kah?");
 inputNumber = key.nextInt();
 angka++;
 }
 
 out.println("Hoki sii kata gue teh");
 out.println("setelah " +angka+ " kali percobaan:v");
 key.close();
 }
}