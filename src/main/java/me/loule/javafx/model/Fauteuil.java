package me.loule.javafx.model;

public class Fauteuil extends Mobilier {
    private int places;

    public Fauteuil(String matiere, double largeur, double longueur, double hauteur, double poids, double pieds, String couleur, double prix, int places) {
        super(matiere, largeur, longueur, hauteur, poids, pieds, couleur, prix);
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public String toString() {
        return "Fauteuil [matiere=" + getMatiere() + ", largeur=" + getlargeur() + ", longueur=" + getlongueur() + ", hauteur=" + gethauteur() + ", poids=" + getPoids() + ", pieds=" + getPieds() + ", couleur=" + getCouleur() + ", prix=" + getPrix() + ", places=" + getPlaces() + "]";
    }
}
