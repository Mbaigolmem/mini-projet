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
public class ProductionR extends Production implements Risque{
    
    public ProductionR(String matricule,String nom,String prenom,Short age,String date_entree,int unite_produite){
        super(matricule,nom,prenom,age,date_entree,unite_produite);
        
    }
    @Override
    double calculsalaire(){
    return super.calculsalaire()+ prime;
}
    
}
