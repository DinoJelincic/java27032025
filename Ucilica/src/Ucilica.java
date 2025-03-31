public class Ucilica {
    public static void main (String [] args){
        Trokut trokutA = new Trokut("trokutA", 3,4,5);
        System.out.println("Opseg prvog trokuta je:" + trokutA.getOpseg());
        System.out.println("Povrsina prvog trokuta je: " + trokutA.getPovrsina() );

        Krug krug = new Krug("kruga", 22);
        System.out.println("Opseg kruga je: " + krug.getOpseg());
        System.out.println("Povrsina kruga je: " + krug.getPovrsina());

        Pravokutnik pravokutnik = new Pravokutnik("pravokutnik",10, 22);
        System.out.println("Opseg prvakotnuka je: " + pravokutnik.getOpseg());
        System.out.println("Povrsina pravokutnika je: " + pravokutnik.getPovrsina());

    }
}
