public class Etablissement {
    int max;
    Etudiant [] Tab ;
    Etablissement(int max){
        this.max = max;
        Tab = new Etudiant [this.max];
    }
    int capacity(){
        return this.max;

    }
    void ajoutetud(Etudiant e){
        for(int i = 0; i < this.capacity(); i++){
            if(Tab[i]==null){
                e = new Etudiant(i);
                e.lecture();
                Tab[i]=e;
            }
            else continue;
        }
    }
    int size(){
        int s = 0;
        for(Etudiant e : this.Tab){
            if(e != null){
                s++;
            }
            else break;
        }
        return s;
    }
    void afficher(){
        for(Etudiant e : this.Tab){
            System.out.println("\n----------------");
            e.affichage();
        }
        
    }
     Etudiant [] etud_valide(){
        int count = 0;
        int i = 0; 
        for(int j = 0; j < this.Tab.length; j++){
            if(this.Tab[j] == null || this.Tab[j].valide() == false) continue;
            else count++;
        }
        Etudiant eValide [] = new Etudiant[count];
        for(Etudiant e : this.Tab){
            if(e.valide()){
               eValide[i] = e;
               i++;
            }
            else continue;
        }


        return eValide;
    
    }

 void etud_afficher(){
        Etudiant [] k = etud_valide();
        if(k == null){
            System.out.println("k is null");

        }
        else System.out.println("k is not null");
        for(int i = 0 ; i < k.length && k[i] != null;i++){
            System.out.println(k[i].calMoy());
        }
}

   
    void tri_etude(){
        Etudiant [] k = this.etud_valide();
        if(k == null )System.out.println("k is null");
        else System.out.println("k is not null");
        for(int h = 1; h < k.length; h++){
          Etudiant current = k[h]; 
          if(current == null){
              System.out.println("current is null :");
              System.out.println("the value of k: "+ k[h]);
          }
          int j = h - 1;
          while(j >= 0 && k[j].calMoy() > current.calMoy()){
              k[j+1] = k[j];
              j--;
          }
          k[j+1] = current;
      }
  
            System.out.println("------------------list des etudiant ayant valide ");
        for(int i = 0; i < k.length; i++){
            System.out.println("etudiant order"+(i+1));
            k[i].affichage();
            if(k[i].calMoy() > 16 ){
                System.out.println("tres bien !");
            }
            else if(k[i].calMoy() > 14 ){
                System.out.println("bien !");
            }
            else if(k[i].calMoy() > 12 ){
                System.out.println("assez bien !");
            }
            else if(k[i].calMoy() > 10 ){
                System.out.println("passable");
            }
            else {}
        }
    }
}
