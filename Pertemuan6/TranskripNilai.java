package Pertemuan6;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        try {
            SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            this.tglCetak = sdfInput.parse("2023-03-23 09:58:42");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }
    public void hitungIPK() {
        // Belum dibuat, jadi biarkan ipk = 0.0
    }
    public void display() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'WIB' yyyy", new Locale("en", "US"));
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + sdf.format(tglCetak));
        System.out.println("IPK: " + ipk);

        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.print(khs.display());
        }
    }
}
