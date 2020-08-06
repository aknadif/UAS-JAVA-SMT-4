package UAS_1;

public abstract class Kampus {
    String nama, kelas, matkul, asal, bagian;
    int umur, nim;

    public abstract void kegiatan();

    public void tempat() {
        System.out.println("STMIK AMIKOM SURAKARTA");
    }

    public void printmhs() {
        System.out.println("Nama = " + nama);
        System.out.println("Nim = " + nim);
        System.out.println("Umur = " + umur);
        System.out.println("Kelas = " + kelas);
    }

    public void printdosen() {
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("Asal = " + asal);
        System.out.println("Matkul = " + matkul);
    }

    public void printkar() {
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("Bagian = " + bagian);
    }
}