import java.util.Scanner;
class Arr{
public static void main (String [] Ayaa) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Jumlah data: ");
int input = sc.nextInt();
int Array[] = new int[input];
System.out.println("Inputan data: ");

	for (int x=0; x<input; x++) {
System.out.print("Data ke-" + x);
System.out.print(" = ");
	Array[x] = sc.nextInt();
}

	for (int y=0; y<input; y++) {
	if (Array[y]%2 ==0) {
	System.out.println(Array[y] + " adalah bilangan genap");
	} else {
	System.out.println(Array[y] + " adalah bilangan ganjil");
	}
}

int angka = 0;
for (int z = 0; z<input; z++) {
angka = angka + Array[z];
}
	System.out.println("Jumlah data berikut adalah " + angka);
	double rata = angka/input;
	System.out.println("Rata-rata data berikut adalah " + rata);
}
}