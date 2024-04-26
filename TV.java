public class TV extends ProdukElektronik {
    private String jenisLayar;

    public TV(String nama, double harga, String merek, String jenisLayar) {
        super(nama, harga, merek);
        this.jenisLayar = jenisLayar;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public String toString() {
        return super.toString() + ", Jenis Layar: " + jenisLayar;
    }
}
