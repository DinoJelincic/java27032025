public class Ucilica {
    public static void main (String [] args){
        Trokut trokutA = new Trokut("trokutA", 3,4,5);
        System.out.println("Opseg prvog trokuta je:" + trokutA.getOpseg());
        System.out.println("Povrsina prvog trokuta je: " + trokutA.getPovrsina() );

    }
}
