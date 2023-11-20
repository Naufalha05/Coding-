import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

class Hapus2 {
public static void main (String [] Ayaa) {
File evi = new File("HowtoLove.txt");
if (evi.exists()) {
Scanner key = new Scanner(System.in);
char reply;

do {
out.print("Hapus kah? (y/n) ");
reply = 
key.findWithinHorizon(".", 0).charAt(0);
} while (reply != 'y' && reply != 'n');
if (reply == 'y' || reply == 'Y') {
out.println("Yodahh");
evi.delete();
out.println("Yowes udh keapus kok");
} else {
out.println("Baguss");
}
key.close();
}
}
}