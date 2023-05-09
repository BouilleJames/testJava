public class Abonnement {
    public Abonnement(String name) {
        this.mName = name;
    }
    public String name;
}
        if(mLicence > 0) {
            this.mPrice = price;
            this.mTime = time;
            this.mName = name;
            mLicence --;
            System.out.println(mLicence);
        }else {
        System.out.println("Vous n'avez pas de licence");
        }
    }
    private String mName;
    public String getName(){
        return mName;
    }
    public void setmName(String mName) {
        this.mName = name;
    }
    private int mTime;
    public int getmTime() {
        return mTime;
    }
    public void setmTime(int mTime) {
        this.mTime = mTime;
    }
    private int mPrice;
    public int getmPrice() {
        return mPrice;
    }
    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }
    public static int mLicence = 2;
    public static int getLicence() {
        return mLicence;
    }
    public static void setmLicence(int licence) {
        mLicence = licence;
    }
}
