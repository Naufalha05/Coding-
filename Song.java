import static java.lang.System.out;
public class Song {
public static void main(String args[]) {
for (int verse = 1; verse <= 3; verse++) {
out.println("Romeo take me somewhere we can be alone");
out.println("I'll be waiting, all there's left to do is run");
out.println("You'll be the prince, and I'll be the princess");
out.println("It's a love story, baby, just say yes");
switch (verse) {
case 1:
out.println("'Cause you were Romeo, I was a scarlet letter");
case 2:
out.println("And my daddy said, 'Stay away from Juliet'");
case 3:
out.println("But you were everything to me");
case 4:
out.println("I was begging you, 'Please don't go'");
case 5:
out.println("And I said");
}
switch (verse) {
case 4:
out.println("It's a love story, baby, just say yes");
case 3:
out.println("You'll be the prince, and I'll be the princess");
case 2:
out.println("I'll be waiting, all there's left to do is run");
case 1:
out.println("Romeo take me somewhere we can be alone");
}
}
}
}