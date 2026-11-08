public class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public int hargaAkhir() {
        return harga;
    }

    protected static String formatRupiah(int angka) {
        return String.format("Rp%,d", angka).replace(',', '.');
    }

    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println(" Harga        : " + formatRupiah(harga));
    }
}
