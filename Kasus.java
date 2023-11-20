import static java.lang.System.out;
import java.util.Scanner;
class Kasus {
public static void main (String [] args) {
Scanner key = new Scanner(System.in);
out.print("Ulang lagi nih?");
int ulang = key.nextInt();
switch (ulang) {
case 3:
out.println("Cuz i love u");
out.println("cuz i love u");
case 2:
out.println("Cuz i trust u");
out.println("cuz i trust u");
case 1:
out.println("Cuz u my lovely angel");
out.println("cuz u my lovely angel");
}
out.println("nothing wrong with u, cuz u're special person in my life");
key.close();
}
}