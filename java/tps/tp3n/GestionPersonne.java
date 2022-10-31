
import java.io.*;
import java.util.*;
import java.nio.file.*;



public class GestionPersonne{

int n;
Personne [] p;
    private static Path cheminFichierPersonne = Paths.get(System.getProperty("user.home"),"tmps","tps","tst.txt");
    GestionPersonne(){
        System.out.println("enter le nombre des personnes :");
         n = Integer.parseInt(Personne.clavier());
         p = new Personne[n];


    }
    public static Path getCheminFP(){
        return cheminFichierPersonne; 
    }
    
    public boolean lireArrPers(){
        boolean ok = false ;
        try{
            for(int i = 0; i < p.length; i++){
                p[i] = new Personne();
                p[i].lirePersonne();
                p[i].afficherPersonne();
            }
            ok = true;

        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("i(index) is out of bound");
        }
        return ok;


    }
     public static boolean ecrireDansFichier(String s){
        boolean ok = false;
         try (BufferedWriter writer = Files.newBufferedWriter(getCheminFP())) {

    writer.write(s, 0, s.length());
    ok = true;
} catch (IOException x) {
    System.err.format("IOException: %s%n", x);
}
        return ok;
    }


}
