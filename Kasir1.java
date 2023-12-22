import static java.lang.System.out;
import java.util.Scanner;
public class Kasir1 {
    public String namapelanggan;
    public String benda;
    public int harga;
    public double diskon;

    public int barang;
    public double jumlah;

    public String getNamapelanggan() {
        return namapelanggan;
    }
    public void setNamapelanggan(String newNama) {
        this.namapelanggan = newNama;
    }
    public String getBenda() {
        return benda;
    }
    public void setBenda(String newBenda) {
        this.benda = newBenda;
    }

    public int getHarga() {
        return harga;
    }
    public void setHarga(int newHarga) {
        this.harga = newHarga;
    }

    public double getDiskon() {
        return diskon;
    }
    public void setDiskon(double newDiskon) {
        this.diskon = newDiskon;
    }

    public int getBarang() {
        return barang;
    }
    public void setBarang(int newBarang) {
        this.barang = newBarang;
    }

    public double getJumlah() {
        return jumlah;
    }
    public void setJumlah(double newJumlah) {
        this.jumlah = newJumlah;
    }

    public static void main (String [] ayaa) {
        out.println("-----------------------------");
        Scanner sc = new Scanner(System.in);
        out.print("Nama pelanggan: " );
        String namapelanggan1 = sc.nextLine();
        out.print("Nama barang: ");
        String barang1 = sc.nextLine();
        out.print("Harga barang: ");
        int harga1 = sc.nextInt();
        out.print("Jumlah barang: ");
        int item = sc.nextInt();
        double diskon1 = harga1 * item * 0.1;
        out.println("Diskon anda: 10%");
        out.println("-------RESI PEMBAYARAN-------");
        out.println("Nama pelanggan: " + namapelanggan1);
        out.println("Nama barang: " +barang1);
        out.println("Harga barang: " +harga1);
        out.println("Jumlah barang: " +item);
        out.println("Total pembayaran anda: \t" + diskon1);
        out.println("-----------------------------");
    }
}
