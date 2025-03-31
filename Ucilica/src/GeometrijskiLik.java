public abstract class GeometrijskiLik {
    private String naziv;
    public GeometrijskiLik(String naziv){
        this.naziv = naziv;
    }

    public String getNaziv(){
        return naziv;
    }
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public abstract double getOpseg();
    public abstract double getPovrsina();
}
