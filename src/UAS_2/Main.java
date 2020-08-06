package UAS_2;

class Kampus {
    String nama, kelas, asal;
    int nim;

    void display() {
        System.out.println("Nama : " + this.nama);
    }
}

class Mahasiswa extends Kampus {
    // @Overriding
    void display() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Nim : " + this.nim);
        System.out.println("Kelas : " + this.kelas);
    }
}

class Dosen extends Kampus {
    void display() {
        // @Overriding
        System.out.println("Nama : " + this.nama);
        System.out.println("Asal : " + this.asal);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa siswa1 = new Mahasiswa();
        Dosen dosen1 = new Dosen();
        // Siswa
        System.out.println("========= Mahasiswa =========");
        siswa1.nama = "Ahmad Khainur Nadhif";
        siswa1.nim = 1803010024;
        siswa1.kelas = "IV F";
        // asal tidak ditampilkan karena di method display mahasiswa tidak ada.
        siswa1.asal = "Solo";
        siswa1.display();
        // Dosen
        System.out.println("========= Dosen ============");
        dosen1.nama = "Joko";
        dosen1.asal = "Surakarta";
        // Nim tidak akan ditampilkan karna di method display dosen tidak ada
        dosen1.nim = 102940249;
        dosen1.display();
    }
}