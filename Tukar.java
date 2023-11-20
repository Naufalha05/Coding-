import static java.lang.System.out;
import java.util.Scanner;
class Tukar {
public static void main (String [] args) {
Scanner key = new Scanner(System.in);
out.println("Ngulang yang mana?");
int ulang = key.nextInt();
switch (ulang) {
case 1:
out.println("Cuz i love u");
break;
case 2:
out.println("Cuz i trust u");
break;
case 3:
out.println("Cuz u my lovely angel");
break;
default:
out.println("nothing wrong with u, cuz u're special person in my life");
break;
}
out.println("See?");
key.close();
}
}