import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class TebakT {
public static void main (String [] ayaa) throws IOException {
int tamu[] = new int[10];
Scanner diskScanner = new Scanner(new File("Alyaa.txt"));
for(int angka = 0; angka < 10; angka++) {
tamu[angka] = diskScanner.nextInt();
}
out.println("Room\tGuest");
for(int angka = 0; angka < 10;angka++) {
out.print(angka);
out.print("\t");
out.println(tamu[angka]);
}
diskScanner.close();
}
}