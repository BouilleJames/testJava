public class Animal {
    public Animal(String name, int age, boolean vaccin, String action, String race, int taille) { // Constructeur de classe
        setmName(name);  //les arguments
        setmAge(age);
        setmVaccin(vaccin);
        setmAction(action);
        setmRace(race);
        setmtaille(taille);
    }

    private String mName;  // encapsuler dans la classe
    public String getName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    private int mAge;  // exemple: public int mAge; si on passe en public celle-ci est visible à l'exterieur de la classe 
    // les accesseurs
    public int getAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }

    private boolean mVaccin;
    public boolean getVaccin() {
        return mVaccin;
    }

    public void setmVaccin(boolean mVaccin) {
        this.mVaccin = mVaccin;
    }

    private String mAction;
    public String getAction() {
        return mAction;
    }
    public void setmAction(String mAction) {
        this.mAction = mAction;
    }

    private String mRace;
    public String getmRace() {
        return mRace;
    }
    public void setmRace(String mRace) {
        this.mRace = mRace;
    }

    private int mTaille;
    public int getmTaille() {
        return mTaille;
    }
    public void setmtaille(int mTaille) {
        this.mTaille = mTaille;
    }
    // Méthodes de classe
    public void afficher() {
        System.out.println("La race est : " + getmRace() + " et la taille est : " + getmTaille());
    }
}
