import java.util.Scanner;
class User {
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
int height = sc.nextInt();
System.out.println("Name: " +name);
System.out.println("Height: " +height +" cm");
}
}