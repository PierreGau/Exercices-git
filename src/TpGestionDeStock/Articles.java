package TpGestionDeStock;

public class Articles
{
    private String nom;
    private int reference, quantite;
    private double prix;

    public Articles(String nom, int reference, int quantite, double prix) {
        this.nom = nom;
        this.reference = reference;
        this.quantite = quantite;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Articles() {
    }

    public String toString()
    {
        return String.format("[%s\n" +
                "Prix : %.2f\n" +
                "Quantite : %d\n" +
                "Reference : %d]",nom,prix,quantite,reference);
    }
}
