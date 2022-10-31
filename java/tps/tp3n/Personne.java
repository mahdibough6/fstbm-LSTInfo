import java.io.*;
import java.util.*;
import java.nio.file.*;

public class Personne {

    File fich = new File(" test.txt");
    private String nom;
    private String prenom;
    private String dateNaissance;
    
    static int id = 0;
    Personne(){
        id++;
    }

    public static String clavier(){
        String res;
        Scanner in = new Scanner(System.in);
        res = in.nextLine();
        //in.close();
        return res;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getDate(){
        return dateNaissance;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setDateNaissance(String dateNaissance){
        this.dateNaissance = dateNaissance;
    }
    public void lirePersonne(){

        System.out.println("entrer le nom :");
        String nom = clavier();
        System.out.println("entrer le prenom :");
        String prenom = clavier();setPrenom(prenom);
        System.out.println("entrer le date de naissance :");
        String dateNaissance = clavier();setDateNaissance(dateNaissance);
        try{
        FileWriter ecrivain = new FileWriter(fich);
        ecrivain.write("les informations de la personnes N°"+id);
        ecrivain.write("\nnom :"+nom);
        ecrivain.write("\nprenom :"+prenom);
        ecrivain.write("\ndate :"+dateNaissance);
        ecrivain.close();
        }
        catch(IOException e){
            
        }
        
    }
    public void afficherPersonne(){
         
        System.out.println("Les Informations de la personne N "+id);
        System.out.println("Nom : "+this.nom+"\nPrenom :"+this.prenom+"\nDate de Naissance :"+this.dateNaissance);
    }
    public static void main(String [] args){ 


        GestionPersonne g = new GestionPersonne();
        g.lireArrPers();

    }
}

