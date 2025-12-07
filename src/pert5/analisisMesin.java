package pert5;

public class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] inventarisMesin = new defaultMesin[3];

        inventarisMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        inventarisMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        inventarisMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);

        System.out.println("=== DATA MESIN MEGATECH ===");

        for (defaultMesin mesin : inventarisMesin) {
            mesin.tampilInfo();
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.printf("Performa: %.1f\n\n", mesin.nilaiPerforma());
        }

        System.out.println("\n=== SUARA MESIN ===");

        for (defaultMesin mesin : inventarisMesin) {

            if (mesin instanceof mesinMotor) {
                mesinMotor motor = (mesinMotor) mesin;
                System.out.println(motor.namaMesin + " → " + motor.suaraMesin());

            } else if (mesin instanceof mesinTraktorListrik) {
                mesinTraktorListrik trli = (mesinTraktorListrik) mesin;
                System.out.println(trli.namaMesin + " → " + trli.suaraMesin());

            } else if (mesin instanceof mesinTraktor) {
                mesinTraktor trak = (mesinTraktor) mesin;
                System.out.println(trak.namaMesin + " → " + trak.suaraMesin());
            }
        }


        // --- Bagian 3: Mesin Performa Tertinggi ---
        defaultMesin mesinTertinggi = null;
        double performaTertinggi = -1;

        for (defaultMesin mesin : inventarisMesin) {
            double nilai = mesin.nilaiPerforma();
            if (nilai > performaTertinggi) {
                performaTertinggi = nilai;
                mesinTertinggi = mesin;
            }
        }

        System.out.println("\n\n=== MESIN PERFORMA TERTINGGI ===");
        System.out.printf("%s → %.1f\n", mesinTertinggi.namaMesin, performaTertinggi);


        // --- Bagian 4: Tambah 1 mesin lagi untuk TOP 3 ---
        // Sesuai output: Volta FarmX harus ikut sorting TOP 3
        defaultMesin[] mesinTop = new defaultMesin[4];
        mesinTop[0] = inventarisMesin[0];
        mesinTop[1] = inventarisMesin[1];
        mesinTop[2] = inventarisMesin[2];
        mesinTop[3] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        // Sorting descending (bubble sort)
        for (int i = 0; i < mesinTop.length - 1; i++) {
            for (int j = 0; j < mesinTop.length - 1 - i; j++) {
                if (mesinTop[j].nilaiPerforma() < mesinTop[j + 1].nilaiPerforma()) {
                    defaultMesin tmp = mesinTop[j];
                    mesinTop[j] = mesinTop[j + 1];
                    mesinTop[j + 1] = tmp;
                }
            }
        }

        System.out.println("\n\n=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d. %s → %.1f\n",
                    i + 1, mesinTop[i].namaMesin, mesinTop[i].nilaiPerforma());
        }
    }
}
