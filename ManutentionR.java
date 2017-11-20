/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaire;

/**
 *
 * @author porpo
 */
public class ManutentionR extends Manutention implements Risque{
    public ManutentionR(String matricule,String nom,String prenom,short age,String date_entree,double heure){
        super(matricule,nom,prenom,age,date_entree,heure);
    }
    @Override
     double calculsalaire(){
         return super.calculsalaire()+ prime;
     }
}
