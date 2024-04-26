public class Smartphone extends ProdukElektronik {
    private String sistemOperasi;

    public Smartphone(String nama, double harga, String merek, String sistemOperasi) {
        super(nama, harga, merek);
        this.sistemOperasi = sistemOperasi;
    }

    public String getSistemOperasi() {
        return sistemOperasi;
    }

    public String toString() {
        return super.toString() + ", Sistem Operasi: " + sistemOperasi;
    }
}
