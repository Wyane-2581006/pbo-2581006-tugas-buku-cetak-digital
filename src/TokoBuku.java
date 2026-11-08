public class TokoBuku {
    public static void main(String[] args) {

        /*
         * EKSPERIMEN ERROR CONSTRUCTOR SUPER()
         *
         * Percobaan:
         * Menghapus super(judul, penulis, harga)
         * dari constructor BukuDigital.
         *
         * Pesan error yang diharapkan:
         *
         * Error: constructor Buku in class Buku cannot
         * be applied to given types.
         *
         * Penyebab:
         * Java mencoba memanggil constructor kosong
         * super() secara otomatis.
         *
         * Namun, class Buku tidak memiliki constructor
         * tanpa parameter. Constructor Buku membutuhkan
         * tiga parameter yaitu judul, penulis, dan harga.
         *
         * Solusi:
         * Mengembalikan super(judul, penulis, harga)
         * ke constructor BukuDigital.
         */

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

        // Menampilkan informasi buku
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
