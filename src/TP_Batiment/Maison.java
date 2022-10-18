package TP_Batiment;

public class Maison extends Batiment
{
    private int nbPieces;

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    public Maison()
    {
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    public String toString()
    {
        return String.format("La maison est située à l'adresse : %s\net elle dispose de %d pièces",getAdresse(),nbPieces);
    }
}
