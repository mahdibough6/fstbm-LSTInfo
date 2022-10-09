package com.betagors.app;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        
        Etudiant[] e = new Etudiant[4];
        for(int h = 0; h < e.length; h++){
            e[h] = new Etudiant(h);
            e[h].lecture();
            e[h].affichage();
            if(e[h].valide())System.out.println("valider !");
            else System.out.println("non valider !");
        }
    }
}



class Etudiant{
    public int ord;
    public String nom;
    public String prenom;
    public String date;
    public int CNE;
    public double [] notes = new double[4];
    public Etudiant(int ord) {
       this.ord = ord; 

    }
    
    public String clavier() {
        Scanner in = new Scanner(System.in);
        String result = in.nextLine();
        return result;

    }
    public void lecture() {
        System.out.println("--------------------lecture()-------------------");
        System.out.print("\nenter le nom :");
        this.nom = this.clavier();
        System.out.print("\nenter le prenom :");
        this.prenom = this.clavier();
        System.out.print("\nenter la date de naissance :");
        this.date = this.clavier();
        System.out.print("\nenter le CNE :");
        this.CNE = Integer.parseInt(this.clavier());
        System.out.print("\n----enter les notes");
        for (int i = 0; i < this.notes.length; i++) {
            System.out.print("\nnote"+(i+1)+"  :");
            this.notes[i] = Double.parseDouble(this.clavier());
        
        }}
    public double calMoy(double[] notes) {
        double total = 0;
        for (int i = 0; i < notes.length; i++) {
            total += notes[i];
        }
        double moy = total / notes.length;
        return moy;
       
    }
    public void affichage() {
        System.out.println("--------------------affichage()-------------------");
        System.out.println("Le nom : " + nom + "\nLe prenom : " + prenom + "\ndate :" + date + "\nCNE :" + CNE + "\nla note moyenne :" + calMoy(this.notes));
        
    }
    public boolean valide() {
        boolean ok = false;
        for (double note : this.notes) {
            if (note < 7) {
                ok = false;
                break;
              
            }
            else{
                if (calMoy(this.notes)>= 10) {
                    
                ok = true;
                continue;
                }
                else{
                    ok = false;
                    break;
                }
            }
        }
        
           return ok; 
    }
    

}
    

