import java.util.Scanner;
class Conditional {
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
int height = sc.nextInt();
System.out.println("Name: " +name);
System.out.println("Height: " +height +" cm");
if (height < 160) {
System.out.println("Note: You too short, buddy!");
} else if (height <= 170) {
System.out.println("Note: You have an ideal height!");
} else { 
System.out.println("Note: You're absolutely power pole");
}
}
}