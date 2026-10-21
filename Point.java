public class Point {
    private int abscisse;
    private int ordonne;

    // constructeurs
    public Point() {
        abscisse = 0;
        ordonne = 0;
    }

    public Point(int abscisse, int ordonne) {
        this.abscisse = abscisse;
        this.ordonne = ordonne;
    }

    // méthode d'affichage
    public void affichage() {
        System.out.println("(" + abscisse + "," + ordonne + ")");
    }
}
