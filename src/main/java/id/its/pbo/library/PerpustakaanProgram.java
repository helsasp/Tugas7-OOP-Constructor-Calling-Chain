package id.its.pbo.library;


public class PerpustakaanProgram {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan() ;

        // Add books
        Buku buku1 = new Buku("Harry Potter", "JK Rowling", 1975);
        Buku buku2 = new Buku("Programming with Java", "Elon Musk", 2010);
        
        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);

        // Add anggota
        Anggota anggota1 = new Anggota("Helsa Putri", "HS36");
        Anggota anggota2 = new Anggota("Harry Styles", "Brooklyn ST. 37", "HS11");

        // Add to perpus
       
        perpus.tambahAnggota(anggota1);
        perpus.tambahAnggota(anggota2);

        // Pinjam
        perpus.pinjamBuku(anggota1, buku2);
        perpus.pinjamBuku(anggota2, buku1);

        // Result
        System.out.println("Daftar Buku:");
        for (Buku buku : perpus.getDaftarBuku()) {
            System.out.println(buku.getInfoBuku());
        }

        System.out.println("\nDaftar Anggota:");
        for (Anggota anggota : perpus.getDaftarAnggota()) {
            System.out.println(anggota.getInfoAnggota());
        }
    }
}
