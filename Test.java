public class Test {
    public static void main(String[] args) {
        // création d'objets
        Trapeze t1 = new Trapeze();
        Trapeze t2 = new Trapeze(4, 2, 6, 8);

        // calcul du périmètre
        double p = t2.perimetre();
        System.out.println("perimetre = " + p);
        System.out.println("aire = " + t2.aire());
        t2.affichage();

        // le trapèze par défaut
        System.out.println("perimetre de t1 = " + t1.perimetre());

        // test de la classe Point
        Point origine = new Point();
        Point a = new Point(3, 5);
        origine.affichage();
        a.affichage();
    }
}
