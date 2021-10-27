public class Main {
    public static void main(String[] args) {
        Songverwaltung verwaltung = new Songverwaltung(10);
        verwaltung.fillArray();
        verwaltung.gibAlleSongsAus();
        System.out.println();
        verwaltung.sucheUndSpieleSong("aTitel");
    }
}
