import java.io.*;
class EcritureFichierBinaire{
    String s;
DataOutputStream ecrivain;
    File fich;
    EcritureFichierBinaire(String nomFichier, String s){
        this.s = s;
fich = new File(nomFichier);

    }
    public void enrgPersonne(String s) throws IOException{ 
ecrivain = new DataOutputStream (new FileOutputStream(fich));
    for(String c : s{
    ecrivain.writeChar(c);
}
ecrivain.close();

 }
}
