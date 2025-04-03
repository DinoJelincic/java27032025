public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {
    private String naziv;
    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public abstract double opseg();
    public abstract double povrsina();

    @Override
    public int compareTo(GeometrijskiLik drugi) {
        return Double.valueOf(this.povrsina()).compareTo(Double.valueOf(drugi.povrsina()));
    }
}
