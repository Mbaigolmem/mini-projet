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
public class Representant extends Commercial{
    private final static double POURCENT=0.2;
    private final static int BONUS=200;
    public Representant(String matricule,String nom,String prenom,short age,String date_entree,double chiffreAffaire){
        super(matricule,nom,prenom,age,date_entree,chiffreAffaire);
        
    }

    @Override
    double calculsalaire() {
        return (POURCENT * getChiffreAffaire()) + BONUS;
    }
    
    
     

    public String getTitre()
    {
        return"le representant";
    }
}
