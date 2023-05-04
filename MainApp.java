// Pour un commentaire sur une seule ligne

/*
 * Pour un commentaire sur 
 * plusieurs lignes
 */

/*
 *base numérique : décimale (10 -> 0 à 9)
 *                  binaire (2 -> 0 à 1)
 *                  octale (8 -> 0 à 7)
 *                  hexadécimale (16 -> 0 à F)
 * 
 *   nombre entier : 12
 *                 12_333_333_333  pour facilter la lecture
 *              ou  12333333333
 *  binaire -> 0b1100011
 *             1_100_011
 *  hexadécimale -> 0xFB233
 *  \n : retour à la ligne
 *  \t : tabulation
 *  \r : retour chariot (saut de ligne)
 *  \b : retour arrière
 *  \f : nouvelle page (file)
 *  == et !=
 * 
 * pas de caracteres ,pas d'espaces, commence par une lettre ou un underscore (_)
 * 
 */
/*
 * public class MainApp 
{
    public static void main(String[] args)
    {
        System.out.println("36");
    }
}

 */
/*
 * public class MainApp {
    public static void main(String[] args) {
        int maVariable = 36;
        System.out.println(maVariable);
        maVariable = maVariable + 1;
        System.out.println(maVariable);
    }
}
 */
// Déclaration d'une constante
/*
 *  public class MainApp
 {
    public static void main(String[] args)
    {
        final int MAVARIABLE = 36;
        System.out.println(MAVARIABLE);
    }
 }
*/
/*
 *  public class MainApp
 {
    public static void main(String[] args)
    {
        final boolean PO = false;
        System.out.println(PO);
    }
 }
 */

 /*
  * public class MainApp
 {
    public static void main(String[] args)
    {
        int age = 7;
        if (age >= 18 || age < 64) {
            System.out.println(age);
        } else {
            System.out.println("non");
        }
        
    }
 }
  */

  /*
   * public class MainApp
 {
    public static void main(String[] args)
    {
        int age = 21;
        if (age >= 18) {
            System.out.println("Vous etes majeur ");
            if (age >= 21) {
                System.out.println("dans tt les pays");
            } else {
                System.out.println("en France");
            }
        } else {
            System.out.println("non");
        }
    }
 }
   */

 // ou avec un switch

 /*
  * public class MainApp
 {
    public static void main(String[] args)
    {
        int age = 17;
        String cas = "mineur";
        
        if (age >= 18) {
            if (age >= 21) {
                cas = "majeur absolut";
            } else {
                cas = "majeur";
            }
        }
        switch (cas) {
            case "majeur":
            System.out.println("Vous etes majeur en France");
            break;
            case "majeur absolut":
            System.out.println("Vous etes majeur dans le monde entier");
            break;
            default:
            System.out.println("Vous etes mineur");
            break;
        }
 }
 }
  */

  /*
   * public class MainApp {
    public static void main(String[] args)
    {
        int i = 0;
        while (i != 20) {
            if (i == 10) {
                continue;
            }
            i+=1;
            System.out.println(i);
            
        }
    }
  }
   */
// import java.util.Scanner;

//    public class MainApp {
//     public static void main(String[] args)
//     {
        
//         Scanner valeurDebut = new Scanner( System.in );
//         System.out.print( "Veuillez saisir une valeur de debut : " );
//         int i = valeurDebut.nextInt();
//         Scanner valeurFin = new Scanner( System.in );
//         System.out.println( "Veuillez saisir une valeur de fin : " );
//         int fin = valeurFin.nextInt();
//         valeurDebut.close();
//         valeurFin.close();

//         if (i > fin) {
//             System.out.print( "La valeur de debut doit etre plus petite que celle de fin : " );
//         } else  {
//             System.out.println( "Les chiffres pairs entre ces deux intervalles sont : " );
//         }
//         do {
//             i++;
//             if (i % 2 != 0) {
//                 continue;
//             } else {}
//             System.out.println(i);
//         }
//         while (i != fin);
//     }
//   }

/*
 * public class MainApp {
        public static void main(String[] args) 
        {
           for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        }
    }
}
 */