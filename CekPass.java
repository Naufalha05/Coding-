import static java.lang.System.*;
import java.util.Scanner;
class CekPass {
public static void main (String [] args) {
out.println("Apa kata kuncinya?");
Scanner key = new Scanner(in);
String Pass = key.next();
out.println("Kamu ketik>>" +Pass +"<<");
if (Pass=="Anata") {
out.println("Pinoy");
out.println("coba lagi");
} else {
out.println("Pass nya udah betul");
out.println("Kamu emang my love");
}
if (Pass.equals("Anata")){
out.println("Pass nya sama");
out.println("Dengan hatinya");
out.println("Silahkan masuk");
}else{
out.println("Tapi Pass nya beda");
out.println("Dengan hatinya");
out.println("benerin dulu passnya");
}
key.close();
}
}