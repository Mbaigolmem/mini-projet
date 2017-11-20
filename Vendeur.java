package salaire;
 

   public class Vendeur extends Commercial{
       private final static double POURCENT=0.2;
       private final static int BONUS=100;
       public Vendeur( String matricule,String nom,String prenom,short age,String date_entree, double ChiffreAffaire){
                super(matricule,nom,prenom,age,date_entree,ChiffreAffaire);
       }
          
       
           public String getTitre(){
               return"Le Vendeur";
                    
           }

    @Override
    double calculsalaire() {
         return(POURCENT*this.getChiffreAffaire())+BONUS;
    }

 }
       
       
   