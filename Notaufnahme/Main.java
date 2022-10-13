public class Main {

    public static void main(String[] args) {
        
    // Die Patienten
    Patient patA;
    Patient patB;
    Patient patC;

    Warteliste liste;

    // Erzeuge alle Objekte
    patA = new Patient("Anna");
    patB = new Patient("Barbara");
    patC = new Patient("Claus");

    liste = new Warteliste();

    // Fuege drei Patienten in die Warteliste ein
    liste.einfuegen(patA);
    liste.einfuegen(patB);
    liste.einfuegen(patC);
        
    // Ruft den ersten Patienten auf und gibt dessen Namen aus
    Patient pat = liste.aufrufen();
    System.out.println("Naechster Patient: " + pat.getName());
    
    // Alle Patienten der Warteliste ausgeben
    liste.ausgeben();
    
        
       
    }
}
