import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOExpection;
import java.io.PrintStream;

class Kamar {
public static void main (String [] ayaa) throws IOExpection {
int tamu[] = new int[10];
int NoKamar;
Scanner diskScanner = new Scanner(new File("Buku.txt"));
for (NoKamar = 0; NoKamar <10; NoKamar++) {
tamu[NoKamar] = diskScanner.nextInt();
}
diskScanner.close();
NoKamar = 0;
while (NoKamar < 10 && tamu[NoKamar] != 0) {
NoKamar++;
}
if (NoKamar==10) {
out.println("Maaf, Tidak Tersedia Kamar yang Kosong");
} else {
out.print("Sisa Kamar");
out.print(NoKamar);
out.print(".");
Scnner key = new Scanner(System.in);
tamu[NoKamar] = key.nextInt();
key.close();

PrintStream List = new PrintStream("Buku.txt");
for (NoKamar = 0; NoKamar < 10; NoKamar++) {
List.print(tamu[NoKamar]);
List.print(" ");
}
List.close();
}
}
}
