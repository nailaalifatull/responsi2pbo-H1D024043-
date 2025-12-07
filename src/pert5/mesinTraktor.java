package pert5;

public class mesinTraktor extends defaultMesin {

    protected double kapasitasTarik;

    public mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.kapasitasTarik = tarik;
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Mesin Traktor %s | Tarik: %.1f ton | Tenaga: %d HP\n",
                namaMesin, kapasitasTarik, tenagaHP);
    }

    @Override
    public double nilaiPerforma() {
        return (tenagaHP * 1.006) + (kapasitasTarik * 5);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor";
    }

    public String suaraMesin() {
        return "GGGRRRR! Hidup mesinnn!";
    }
}
