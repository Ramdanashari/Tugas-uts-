public class ProdukElektronik {
    private String nama;
    private double harga;
    private String merek;

    public ProdukElektronik(String nama, double harga, String merek) {
        this.nama = nama;
        this.harga = harga;
        this.merek = merek;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public String getMerek() {
        return merek;
    }

    public String toString() {
        return "Nama: " + nama + ", Harga: Rp" + harga + ", Merek: " + merek;
    }
}
