package UAS_1;

public class Dosen extends Kampus {

    public Dosen(String nama, int umur, String asal, String matkul) {
        this.nama = nama;
        this.umur = umur;
        this.asal = asal;
        this.matkul = matkul;
    }

    public void kegiatan() {
        System.out.println(" Sebagai Dosen, Mengajar di kelas IV F, dan memberi tugas, mengajar di kampus ");
    }

}