public class Chat {
    private String mName;  // encapsuler dans la classe
    private int mAge;  // exemple: public int mAge; si on passe en public celle-ci est visible à l'exterieur de la classe 
    private boolean mVaccin;
    private String mAction;

    public Chat(String name, int age, boolean vaccin, String action) {
        this.mName = name;
        this.mAge = age;
        this.mVaccin = vaccin;
        this.mAction = action;
    // if (this.mVaccin) 
    //     System.out.println("Bonjour je m'appelle " + this.mName + " je suis un chat de " + this.mAge + "ans" + " je suis vacciné!");
    //  else 
    //     System.out.println("Bonjour je m'appelle " + this.mName + " je suis un chat de " + this.mAge + "ans" + " je ne suis pas vacciné!");
       
}
    
    public int getAge() {
        return mAge;
    }

    public String getName() {
        return mName;
    }

    public boolean getVaccin() {
        return mVaccin;
    }
    public String getAction() {
        return mAction;
    }
}
