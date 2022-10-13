


public class Main{
    public static void main(String [] args){
        Etudiant e = new Etudiant(123);
        e.lecture();
        e.affichage();
        if(e.valide(e.notes))System.out.println("valider !");
        else System.out.println("non valider !");
    }
}
