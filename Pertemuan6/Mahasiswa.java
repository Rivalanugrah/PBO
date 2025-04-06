package Pertemuan6;

public class Mahasiswa {
    private String nrp;
    private String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + nrp + ", Nama: " + nama;
    }
}
