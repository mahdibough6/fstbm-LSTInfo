import java.util.Scanner;


public class Etudiant{
    int ord;
    String nom;
    String prenom;
    String date;
    int CNE;
    public double[] notes = new double[4];

    Etudiant(int ord){
        this.ord = ord;
    }
    String clavier(){
        Scanner in = new Scanner(System.in);
        return (in.nextLine());
    }
    void lecture(){
        System.out.println("enter le nom :");
        this.nom = this.clavier();
        System.out.println("enter le prenom :");
        this.prenom = this.clavier();
        System.out.println("entrer la date de naissance");
        this.date = this.clavier();
        System.out.println("entrer le CNE :");
        this.CNE = Integer.parseInt(this.clavier());
        System.out.println("entrer les notes :");
        for(int i = 0; i < this.notes.length; i++){
            System.out.println("note"+(i+1));
            notes[i] = Double.parseDouble(this.clavier());
        } 

    }
    public double calMoy(){
        double total = 0 ;
        for ( double elem : this.notes) {
           total += elem ;
        }
        return total/4 ;
    }
    void affichage(){
        System.out.println("\nle nom :"+this.nom+"\nle prenom :"+this.prenom+"\ndate de naissance :"+this.date+"\nCNE :"+this.CNE+"\nla moyenne :"+calMoy());
    }
    boolean valide(){
        boolean ok = true;
        if(calMoy() >= 10){
            for (double elem : notes){
                if(elem >= 7) continue;
                else{
                    ok = false;
                    break;
                }  

            }
        }
        else {
            ok = false ;
        }
        return ok;
    }
}
