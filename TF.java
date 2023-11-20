import javax.swing.JOptionPane;
class TF {
public static void main (String [] args) {
String Nama = JOptionPane.showInputDialog("Nama: ");
String Pass = JOptionPane.showInputDialog("Pass: ");
if (Nama != null && Pass != null && 
(Nama.equals("Naya") && Pass.equals("Love")) ||
(Nama.equals("Anata") && Pass.equals("Darling"))
)
{ JOptionPane.showMessageDialog(null, "Masuk yang.");
} else {
JOptionPane.showMessageDialog(null, "Kamu penyusup hatinya");
}
}
}
