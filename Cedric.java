public class Cedric { // classe
    public Cedric(String name, String surname, String metier, int salaire, int tel) { // constructeur avec ses parametres
        this.name = name;
        this.surname = surname;
        this.metier = metier;
        this.salaire = salaire;
        this.tel = tel;
    }

    public String name; // Déclaration de l'attribut de la classe avec le type et son nom avec la contrainte défini à public 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String surname;
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname= surname;
    }

    public String metier;
    public String getMetier() {
        return metier;
    }
    public void setMetier(String metier) {
        this.metier = metier;
    }

    private int salaire;
    public int getSalaire() {
        return salaire;
    }
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    private int tel;
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
}
