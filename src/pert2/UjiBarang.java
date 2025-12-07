package pert2;

public class UjiBarang {
    public static void main(String[] args) {
        Barangmusik gitarAkustik = new Barangmusik("GTR-001", "Gitar Akustik Yamaha");
        gitarAkustik.ubahHarga(1500000.0);
        gitarAkustik.tambahStok(5);
        Barangmusik drumSet = new Barangmusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitarAkustik.tampilInfo();
        drumSet.tampilInfo();
    }
}

