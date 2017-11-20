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
public class Production extends Employe{
    protected int unte_produite;
    
    public Production(String matricule,String nom,String prenom,short age,String date_entree ,int unte_produite){
        super(matricule,nom,prenom,age,date_entree);
        this.unte_produite=unte_produite;
    }        
    @Override
    double calculsalaire(){
        return unte_produite*5;
    }
      public void setUnite_production(int unte_production){
          this.unte_produite=unte_produite;
      }
    
} 
