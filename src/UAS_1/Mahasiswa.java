package UAS_1;

public class Mahasiswa extends Kampus {

    public Mahasiswa(String nama, int nim, int umur, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
        this.kelas = kelas;
    }

    public void kegiatan() {
        System.out.println("Sebagai Mahasiswa, Belajar di kelas IV F, Kuliah di ");
    }
}