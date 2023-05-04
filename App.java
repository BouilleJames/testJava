import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Chat c = new Chat("Tom", 1, true, "Miaou");
        name(c);
        // Chat d = new Chat("Felix", 5, false, "Miaou");
        // name(d);
    }

    public static void name(Chat chat) {
        String question = "Bonjour je m'appelle " + chat.getName() + " je suis un chat de " + chat.getAge() + "ans" + (chat.getVaccin() ? " je suis vacciné!" : " je ne suis pas vacciné!") + "Voulez-vous que je miaule ? (y/n)";
        boolean continuePresentation = true;
        do {
            System.out.println(question);
            Scanner saisieUtilisateur = new Scanner(System.in);
            String resp = saisieUtilisateur.next();

            if (resp.equals("y")) {
                System.out.println(chat.getAction());
                continuePresentation = false;
                saisieUtilisateur.close();
            } else if (resp.equals("n")) {
                System.out.println("Ok, au revoir !");
                continuePresentation = false;
                saisieUtilisateur.close();
            } else {
                question = "Je n'ai pas compris votre reponse. Voulez vous que je miaule ? (y/n)";
                continuePresentation = true;
            }
        } while (continuePresentation);

    }
}
