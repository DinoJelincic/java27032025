public class Krug extends GeometrijskiLik {
    private double radijus;

    public Krug(String naziv, double radijus) {
        super(naziv);
        this.radijus = radijus;
    }

    @Override
    public double opseg() {
        return 2 * Math.PI * radijus;
    }

    @Override
    public double povrsina() {
        return Math.PI * radijus * radijus;
    }
}
