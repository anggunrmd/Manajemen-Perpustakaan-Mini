public class User extends Person {
    private String nim;
    private int maxPinjam;
    private int jumlahPinjam = 0;

    public User(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.maxPinjam = hitungMaxPinjam();

        System.out.println("\n=== Informasi Akun User ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Digit terakhir NIM: " + getLastDigit());
        System.out.println("Batas peminjaman: " + maxPinjam + " buku\n");
    }

    private int getLastDigit() {
        return Integer.parseInt(nim.substring(nim.length() - 1));
    }

    private int hitungMaxPinjam() {
        int last = getLastDigit();

        if (last >= 0 && last <= 3) {
            return 2;
        } else if (last >= 4 && last <= 6) {
            return 3;
        } else {
            return 5;
        }
    }

    public void pinjamBuku(Buku b) {
        if (jumlahPinjam >= maxPinjam) {
            System.out.println("❌ Batas peminjaman habis!");
            return;
        }
        if (!b.isTersedia()) {
            System.out.println("❌ Buku sedang dipinjam!");
            return;
        }
        b.pinjam();
        jumlahPinjam++;
        System.out.println("✅ Berhasil meminjam: " + b);
    }

    public void kembalikanBuku(Buku b) {
        if (b.isTersedia()) {
            System.out.println("Buku belum dipinjam!");
            return;
        }
        b.kembalikan();
        jumlahPinjam--;
        System.out.println("📗 Buku dikembalikan: " + b);
    }
}