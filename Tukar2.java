import static java.lang.System.out;
import java.util.Scanner;
class Tukar2 {
public static void main (String [] args) {
Scanner key = new Scanner(System.in);
out.println("Ngulang yang mana?");
String ulang = key.next();
switch (ulang) {
case "one":
out.println("Cuz i love u");
break;
case "two":
out.println("Cuz i trust u");
break;
case "three":
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