package pert5;

public class mesinMotor extends defaultMesin {

    protected String tipeMotor;

    public mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipeMotor = tipe;
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Mesin Motor %s | Tipe: %s | Tenaga: %d HP\n",
                namaMesin, tipeMotor, tenagaHP);
    }

    @Override
    public double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Motor";
    }

    public String suaraMesin() {
        return "Brummm! Mesin motor menyala!";
    }
}

