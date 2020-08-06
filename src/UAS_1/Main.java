package UAS_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("Abstract Bagian Kampus");
        System.out.println("================================");
        Kampus mahasiswa1 = new Mahasiswa("Nadhif", 1803010024, 19, "IV F");
        mahasiswa1.printmhs();
        mahasiswa1.kegiatan();
        mahasiswa1.tempat();
        System.out.println("================================");
        System.out.println("================================");
        Kampus dosen1 = new Dosen("Budi", 46, "Sukoharjo", "Pemrograman Java");
        dosen1.printdosen();
        dosen1.kegiatan();
        dosen1.tempat();
        System.out.println("================================");
        System.out.println("================================");
        Kampus karyawan1 = new Karyawan("Joko", 26, "Administrasi");
        karyawan1.printkar();
        karyawan1.kegiatan();
        karyawan1.tempat();
        System.out.println("================================");
        System.out.println("================================");
    }
}