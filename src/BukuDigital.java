public class BukuDigital extends Buku {

    // Atribut khusus buku digital
    private double ukuranMB;

    // Constructor
    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    // Menghitung harga setelah diskon 20%
    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() * 80 / 100;
    }

    // Menampilkan informasi buku digital
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();

        System.out.println("  Ukuran      : " + ukuranMB + " MB");
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()) + " (diskon 20%)");
    }
}
