package UAS_1;

public class Karyawan extends Kampus {

    public Karyawan(String nama, int umur, String bagian) {
        this.nama = nama;
        this.umur = umur;
        this.bagian = bagian;
    }

    public void kegiatan() {
        System.out.println("Sebagai Karyawan, Bekerja mengurusi adsministrasi di kampus ");
    }

}