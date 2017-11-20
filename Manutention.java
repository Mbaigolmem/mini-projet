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
public class Manutention extends Employe{
  protected double nbreHeur;
  
  public Manutention(String matricule,String nom,String prenom,short age,String date_entree,double hour){
      super(matricule,nom,prenom,age,date_entree);
      nbreHeur=hour;
    }
          
 @Override
  double calculsalaire(){
    return nbreHeur*65;
}
    
}
