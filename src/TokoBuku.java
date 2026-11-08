public class TokoBuku {
    public static void main(String[] args) {

        // Membuat objek buku
        BukuCetak buku1 = new BukuCetak(
                "Pemrograman Java", "John Doe", 120000, 750
        );

        BukuCetak buku2 = new BukuCetak(
                "Algoritma Dasar", "Jane Smith", 95000, 400
        );

        BukuDigital buku3 = new BukuDigital(
                "Belajar OOP", "Ani Wijaya", 80000, 12.5
        );

        // Menampilkan keranjang
        System.out.println("============== KERANJANG ==============");

        buku1.tampilkanInfo();

        buku2.tampilkanInfo();

        buku3.tampilkanInfo();

        // Menghitung total pembayaran
        int totalBayar = buku1.hargaAkhir()
                + buku2.hargaAkhir()
                + buku3.hargaAkhir();

        System.out.println("---------------------------------------");
        System.out.println("Total bayar   : " + Buku.formatRupiah(totalBayar));
    }
}
