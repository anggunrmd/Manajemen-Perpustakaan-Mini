import java.util.ArrayList;

public class Perpustakaan {
    ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
    }

    public Buku cariBuku(String judul) {
        for (Buku b : daftarBuku) {
            if (b.toString().toLowerCase().contains(judul.toLowerCase())) {
                return b;
            }
        }
        return null;
    }

    public void tampilkanSemuaBuku() {
        System.out.println("\n=== Daftar Buku ===");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println((i+1) + ". " + daftarBuku.get(i));
        }
    }
}