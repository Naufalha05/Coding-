class GanGen {
public static void main (String [] Ayaa) {
int angka[] = {1, 4, 9, 2, 8, 13};
for (int x = 0; x<angka.length; x++) {
	if (angka[x]%2 != 0) {
		System.out.println("Bilangan ganjil: " +angka[x]);
	}
}
for (int x = 0; x<angka.length; x++) {
	if (angka[x]%2 == 0) {
		System.out.println("Bilangan genap: " +angka[x]);
	}
}
}
}
