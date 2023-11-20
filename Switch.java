import java.util.Scanner;
class Switch {
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
System.out.println ("Silahkan Pilih Menu Makanan!");
System.out.println ("1. Nasi Goreng");
System.out.println ("2. Mie Goreng");
System.out.println ("3. Mie Aceh");
String nama = sc.nextLine();
int menu = sc.nextInt();
switch(menu) {
case 1:
System.out.println ("1. Nasi Goreng");
break;
case 2:
System.out.println ("2. Mie Goreng");
break;
case 3:
System.out.println ("3. Mie Aceh");
break;
}
System.out.println("Nama: " +nama);
System.out.println("Menu: " +menu);
}
}