import static java.lang.System.out;
import java.util.Scanner;
class TF2 {
public static void main (String [] args) {
Scanner key = new Scanner(System.in);
out.print("Nama: ");
String Nama = key.next();
if (Nama.equals("Naya")) {
out.print("Pass: ");
String Pass = key.next();
if (Pass.equals("Anata")) {
out.println("Masuk yang.");
} else {
out.println("Benerin dulu yang.");
}
} else {
out.println("Bukan ayang aku.");
}
key.close();
}
}
