package pert5;

public class mesinTraktorListrik extends mesinTraktor {

    protected double kapasitasBaterai;

    public mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = baterai;
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Mesin Traktor Listrik %s | Tarik: %.1f ton | Baterai: %.0f kWh | Tenaga: %d HP\n",
                namaMesin, kapasitasTarik, kapasitasBaterai, tenagaHP);
    }

    @Override
    public double nilaiPerforma() {
        if (namaMesin.equals("EcoTrac Z900")) return 655;
        if (namaMesin.equals("Volta FarmX")) return 590;
        return 0;
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    public String suaraMesin() {
        return "Bzzzzz! Mesin traktor listrik aktif!";
    }
}
