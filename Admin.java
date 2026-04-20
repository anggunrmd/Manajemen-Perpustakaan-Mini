public class Admin extends Person {
    private String username;
    private String password;

    public Admin(String nama, String username, String password) {
        super(nama);
        this.username = username;
        this.password = password;
    }

    public void tambahBuku(Perpustakaan p, Buku b) {
        p.tambahBuku(b);
    }
}