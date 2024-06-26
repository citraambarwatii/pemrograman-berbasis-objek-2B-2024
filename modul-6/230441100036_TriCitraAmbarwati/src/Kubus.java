class Kubus extends BangunRuang {
    protected double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    public double sisi() {
        return sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public void info() {
        System.out.println("\nKubus dengan sisi = " + sisi);
    }
}
