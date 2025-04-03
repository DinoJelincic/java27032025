public class Main {
    public static void main(String[] args) {
        Ucilica ucilica = new Ucilica();

        ucilica.dodajLik(new Trokut("Trokut1", 3, 4, 5));
        ucilica.dodajLik(new Trokut("Trokut2", 6, 8, 10));
        ucilica.dodajLik(new Pravokutnik("Pravokutnik1", 5, 6));
        ucilica.dodajLik(new Pravokutnik("Pravokutnik2", 2, 3));
        ucilica.dodajLik(new Krug("Krug1", 4));
        ucilica.dodajLik(new Krug("Krug2", 2.5));

        System.out.println("Prije sortiranja:");
        ucilica.ispisiLikove();

        ucilica.sortirajPoPovrsini();

        System.out.println("Nakon sortiranja:");
        ucilica.ispisiLikove();
    }
}

