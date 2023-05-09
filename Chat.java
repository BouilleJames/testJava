public class Chat {
    /*
     * accesseurs : getter, setter;
     * 
     * accesseur : getter;
     * mutateur: setter;
     * 
     */
    
    
    

    // Le constructeur
    public Chat(String name, int age, boolean vaccin, String action) {
        this.mName = name;  //les arguments
        this.mAge = age;
        this.mVaccin = vaccin;
        this.mAction = action;
    // if (this.mVaccin) 
    //     System.out.println("Bonjour je m'appelle " + this.mName + " je suis un chat de " + this.mAge + "ans" + " je suis vacciné!");
    //  else 
    //     System.out.println("Bonjour je m'appelle " + this.mName + " je suis un chat de " + this.mAge + "ans" + " je ne suis pas vacciné!");
       
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
    
}
