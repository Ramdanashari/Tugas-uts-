import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenTokoElektronik {
    private ArrayList<ProdukElektronik> produk;

    public ManajemenTokoElektronik() {
        produk = new ArrayList<>();
    }

    // Method untuk menambahkan produk
    public void tambahProduk(ProdukElektronik produk) {
        this.produk.add(produk);
        System.out.println("Produk berhasil ditambahkan.");
    }

    // Method untuk menampilkan semua produk
    public void tampilkanProduk() {
        System.out.println("Semua Produk:");
        for (ProdukElektronik produk : this.produk) {
            System.out.println(produk);
        }
    }

    public static void main(String[] args) {
        ManajemenTokoElektronik toko = new ManajemenTokoElektronik();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistem Manajemen Toko Elektronik");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama produk: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan harga produk: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine(); // konsumsi newline
                    System.out.print("Masukkan merek produk: ");
                    String merek = scanner.nextLine();
                    System.out.print("Apakah ini TV? (ya/tidak): ");
                    String isTV = scanner.nextLine();
                    if (isTV.equalsIgnoreCase("ya")) {
                        System.out.print("Masukkan jenis layar: ");
                        String jenisLayar = scanner.nextLine();
                        toko.tambahProduk(new TV(nama, harga, merek, jenisLayar));
                    } else {
                        System.out.print("Masukkan sistem operasi: ");
                        String sistemOperasi = scanner.nextLine();
                        toko.tambahProduk(new Smartphone(nama, harga, merek, sistemOperasi));
                    }
                    break;
                case 2:
                    toko.tampilkanProduk();
                    break;
                case 3:
                    System.out.println("Keluar dari program. Sampai jumpa!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Harap masukkan angka antara 1 dan 3.");
            }
        }
    }
}
