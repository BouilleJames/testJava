//import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Abonnement a = new Abonnement("Netflix");
        // Abonnement b = new Abonnement("Amazon");
        Chien monChien = new Chien("rocky", 7, true, "whaouuuf", "Malinois", 55);
        // Chien r = new Chien("Rocky");

        // une fonction a un nom et entre parentheses des parametres et entre accolades

        /*
         * public static void name(Chat chat) {
         * String question = "Bonjour je m'appelle " + chat.getName() +
         * " je suis un chat de " + chat.getAge() + "ans" + (chat.getVaccin() ?
         * " je suis vacciné!" : " je ne suis pas vacciné!") +
         * "Voulez-vous que je miaule ? (y/n)";
         * boolean continuePresentation = true;
         * do {
         * System.out.println(question);
         * Scanner saisieUtilisateur = new Scanner(System.in);
         * String resp = saisieUtilisateur.next();
         * 
         * if (resp.equals("y")) {
         * System.out.println(chat.getAction());
         * continuePresentation = false;
         * saisieUtilisateur.close();
         * } else if (resp.equals("n")) {
         * System.out.println("Ok, au revoir !");
         * continuePresentation = false;
         * saisieUtilisateur.close();
         * } else {
         * question =
         * "Je n'ai pas compris votre reponse. Voulez vous que je miaule ? (y/n)";
         * continuePresentation = true;
         * }
         * } while (continuePresentation);
         * 
         * }
         */

    }

public static void afficher(Chien monchien) {
    System.out.println("la race est: " + monChien.getmRace());
}

// System.out.println("le chien se nomme : " + r.getmName());
/*Chat c = new Chat("Tom", 1, true, "Miaou"); // instance de la classe Chat
c.setmVaccin(false);
name(c); // UN APPEL à une fonction ou methode

// Chat d = new Chat("Felix", 5, false, "Miaou");
// name(d);*/

}
