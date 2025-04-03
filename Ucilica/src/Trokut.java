public class Trokut extends GeometrijskiLik {
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trokut(String naziv, double stranicaA, double stranicaB, double stranicaC) {
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
    }

    @Override
    public double opseg() {
        return stranicaA + stranicaB + stranicaC;
    }

    @Override
    public double povrsina() {
        double s = opseg() / 2;
        return Math.sqrt(s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC));
    }
}
