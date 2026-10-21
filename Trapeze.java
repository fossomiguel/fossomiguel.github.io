// Trapèze rectangle : deux bases, la hauteur (côté perpendiculaire aux bases)
// et le côté oblique.
public class Trapeze {
    private double grandeBase;
    private double petiteBase;
    private double hauteur;
    private double cote;

    // constructeurs
    public Trapeze() {
        grandeBase = 0;
        petiteBase = 0;
        hauteur = 0;
        cote = 0;
    }

    public Trapeze(double grandeBase, double petiteBase, double hauteur, double cote) {
        this.grandeBase = grandeBase;
        this.petiteBase = petiteBase;
        this.hauteur = hauteur;
        this.cote = cote;
    }

    // périmètre = somme des quatre côtés
    public double perimetre() {
        return grandeBase + petiteBase + hauteur + cote;
    }

    // aire = (grande base + petite base) x hauteur / 2
    public double aire() {
        return (grandeBase + petiteBase) * hauteur / 2;
    }

    // méthode d'affichage
    public void affichage() {
        System.out.println("Trapèze : grande base = " + grandeBase
                + ", petite base = " + petiteBase
                + ", hauteur = " + hauteur
                + ", côté = " + cote);
    }
}
