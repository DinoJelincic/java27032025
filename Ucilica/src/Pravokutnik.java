public class Pravokutnik extends GeometrijskiLik {
    private double stranicaA;
    private double stranicaB;

    public Pravokutnik(String naziv, double stranicaA, double stranicaB) {
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }
    @Override
    public double opseg() {
        return 2 * (stranicaA + stranicaB);
    }
    @Override
    public double povrsina() {
        return stranicaA * stranicaB;
    }
}
