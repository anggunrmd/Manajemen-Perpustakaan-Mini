import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Perpustakaan perpus = new Perpustakaan();
        Admin admin = new Admin("Pak Admin", "admin", "123");

        // Buku awal
        perpus.tambahBuku(new Buku("Struktur Data", "Budi", 2021, "001"));
        perpus.tambahBuku(new Buku("Algoritma", "Andi", 2020, "002"));
        perpus.tambahBuku(new Buku("Kalkulus", "Mukhtar", 2022, "003"));

        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        User user = new User(nama, nim);

        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("\n=== MENU PERPUS MINI ===");
            System.out.println("1. Lihat Buku");
            System.out.println("2. Cari Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    perpus.tampilkanSemuaBuku();
                    break;

                case 2:
                    System.out.print("Judul buku: ");
                    String cari = sc.nextLine();
                    Buku hasil = perpus.cariBuku(cari);
                    if (hasil != null) System.out.println("Ditemukan: " + hasil);
                    else System.out.println("Buku tidak ditemukan!");
                    break;

                case 3:
                    System.out.print("Judul buku yang mau dipinjam: ");
                    String pinjam = sc.nextLine();
                    Buku b1 = perpus.cariBuku(pinjam);
                    if (b1 != null) user.pinjamBuku(b1);
                    else System.out.println("Buku tidak ditemukan!");
                    break;

                case 4:
                    System.out.print("Judul buku yang mau dikembalikan: ");
                    String balik = sc.nextLine();
                    Buku b2 = perpus.cariBuku(balik);
                    if (b2 != null) user.kembalikanBuku(b2);
                    else System.out.println("Buku tidak ditemukan!");
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        sc.close();
    }
}