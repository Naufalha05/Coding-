public class Raport {
	public static void main (String[] args) {
	
	int nilaiKalkulus = 86;
	int nilaiSimDig = 83;
	int nilaiPtik = 54;
	int nilaiPpkn = 62;
	int nilaiTtki = 75;
	
	int totalnilai = nilaiKalkulus + nilaiSimDig + nilaiPtik +  nilaiPpkn + nilaiTtki;
	double rerata = totalnilai / 5;
	System.out.println("Jumlah nilai anda adalah " +totalnilai);
	System.out.println("Nilai rata-rata anda adalah " +rerata);
	}
}