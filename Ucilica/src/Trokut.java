public class Trokut extends GeometrijskiLik {
    //private String naziv;
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trokut(String naziv, double stranicaA, double stranicaB, double stranicaC){
        //this.naziv = naziv;
        super(naziv);
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
    }

    /*public String getNaziv(){
        return naziv;
    }
    public double getStranicaA(){
        return stranicaA;
    }
    public double getStranicaB(){
        return stranicaB;
    }
    public double getStranicaC(){
        return stranicaC;
    }
    public double getOpseg(){
        return stranicaA + stranicaB + stranicaA;
    }

    public double getPovrsina(){
        double abc = getOpseg()/2;
        return Math.sqrt(abc*(abc - stranicaA)*(abc - stranicaB)*(abc - stranicaC));
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public void setStranicaA(double stranicaA){
        this.stranicaA = stranicaA;
    }
    public void setStranicaB(double stranicaB){
        this.stranicaB = stranicaB;
    }
    public void setStranicaC(double stranicaC){
        this.stranicaC = stranicaC;
    }*/
    @Override
    public double getOpseg(){
        return stranicaA + stranicaB + stranicaC;
    }
    @Override
    public double getPovrsina(){
        double s = getOpseg()/2;
        return Math.sqrt(s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC));
    }

}
