public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String isbn;
    private boolean tersedia = true;

    public Buku(String judul, String penulis, int tahunTerbit, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isbn = isbn;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void pinjam() {
        this.tersedia = false;
    }

    public void kembalikan() {
        this.tersedia = true;
    }

    @Override
    public String toString() {
        return judul + " - " + penulis + " (" + tahunTerbit + ") | " + 
               (tersedia ? "Tersedia" : "Dipinjam");
    }
}