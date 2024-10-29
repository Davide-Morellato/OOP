public class App {
    public static void main(String[] args){

        /*
         * PER LAVORARE CON LA NUOVA CLASSE "Persona"
         * 
         * è necessario creare un oggetto come istanza della classe App
         * a partire da:
         * 
         * NomeClasse: tipo di dato che si riferisce alla classe [classe: Persona -> tipo di dato: Persona];
         * nomeOggetto;
         * creazione dell'oggetto: new NomeClasse();
         * 
         */

        //tipo di dato     nome oggetto         creazione oggetto
        //   Person           personOne      =      new Person();   =>  Istanza della Classe Person
        Person personOne = new Person();

        
        //Stampo una proprietà della classe Person
        //accedo alla proprietà name:
        //nome oggetto: personOne
        //dot notation: .
        //nome proprietà: name <- Attributo
        System.out.println("PersonOne proprietà name: " + personOne.name);

        //Invoco il metodo della classe Person
        personOne.greed();


        ///////////////////////////////////////////////////////////////////
        //
        //
        //CREO UN SECONDO OGGETTO RIFERITO ALLA CLASSE PERSON
        Person personTwo = new Person();

        //stampo una proprietà
        System.out.println("PersonTwo proprità age: " + personTwo.age);

        //Invoco il metodo della classe Person
        personTwo.birthday();
    }
}
