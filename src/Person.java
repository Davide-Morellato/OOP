
/* CREAZIONE NUOVA CLASSE 
 * 
 * src -> nomeClasse.java
 * 
 */

 //Classe Person
public class Person{

    //Attributi della classe (proprietà)
       //chiave = valore
    String name = "Luca";

    String surname = "Rossi";

    int age = 33;

    String address = "Via Milazzo, 54";

    String city = "Rome";

    String cap = "00133";


    //Metodi (funzioni) -> azioni che le classi possono compiere
    void greed(){
        System.out.println("PersonOne: " + "Ciao sono " + name);
    }


    void birthday(){
        System.out.println("PersonTwo: " + "Oggi " + name + " compie: " + age);
    }
}