import java.util.*;

public class Ucilica {
    private List<GeometrijskiLik> likovi;

    public Ucilica() {
        likovi = new ArrayList<>();
    }

    public void dodajLik(GeometrijskiLik lik) {
        likovi.add(lik);
    }

    public void sortirajPoPovrsini() {
        // Koristi prirodno sortiranje (compareTo) definirano u GeometrijskiLik
        Collections.sort(likovi);
    }

    public void ispisiLikove() {
        for (GeometrijskiLik lik : likovi) {
            System.out.println("Lik: " + lik.getNaziv() + ", Površina: " + lik.povrsina() + ", Opseg: " + lik.opseg());
        }
    }
}
