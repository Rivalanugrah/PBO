package Pertemuan6;

public class MataKuliah {
    private String kode;
    private String nama;
    private String nilaiHuruf;
    private int sks;

    public MataKuliah(String kode, String nama, String nilaiHuruf, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.nilaiHuruf = nilaiHuruf;
        this.sks = sks;
    }

    public int getSks() {
        return sks;
    }

    public double hitungNilaiTotal() {
        // Belum ada rumus, jadi sementara return 0.0
        return 0.0;
    }

    public String display() {
        return kode + " - " + nama + " - " + nilaiHuruf + " - " + sks + "\n";
    }
}
