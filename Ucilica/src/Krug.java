public class Krug extends GeometrijskiLik {
    //private String naziv;
    private double radijus;

    public Krug (String naziv, double radijus){
        //this.naziv = naziv;
        super(naziv);
        this.radijus = radijus;
    }
    /*public String getNaziv(){
        return naziv;
    }
    public double getRadijus(){
        return radijus;
    }
    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public void setRadijus(double radijus){
        this.radijus = radijus;
    }

    public double getOpseg(){
        return Math.PI * 2 * radijus;
    }
    public double getPovrsina(){
        return Math.pow(radijus, 2) * Math.PI;
    }*/
    @Override
    public double getOpseg() {
        return 2 * Math.PI * radijus;
    }

    @Override
    public double getPovrsina() {
        return Math.PI * radijus * radijus;
    }
}
