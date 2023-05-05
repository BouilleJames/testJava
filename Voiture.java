public class Voiture { // classe = objet
    public Voiture(String marque, String couleur) { // constructeur
        this.mMarque = marque; // attribut = argument
        this.mCouleur = couleur;
    } // fin du constructeur
    private String mMarque; // declaration de l'attribut de la classe
    public String getmMarque() { // methode(qui est aussi un attribut de la classe) pour recuperer la marque
        return mMarque;
    }
    private String mCouleur;
    public String getmCouleur() {
        return mCouleur;
    }
    // public determine que la portée est globale , que l'attribut sera accessible à l'exterieur de la classe
    // private determine que la portee est locale , attribut accessible seulement à l'interieur de la classe
}
