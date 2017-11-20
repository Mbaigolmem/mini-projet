package salaire;


import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author porpo
 */
public class Personnel {
   List<Employe> employe;
    public Personnel(){
        employe=new LinkedList();
        
    }
    
    void AjouterEmploye (Employe E){
        if(!employe.contains(E)){
            this.employe.add(E);
        }else{
            System.out.println("cet employé existe déjà");
        }
    }
    
   public double SalaireMoyen(){
        double result=0;
       for (int i=0;i<employe.size();i++ ) {
           result+=employe.get(i).calculsalaire();
           
       }
         return result/employe.size();
   }
   public void calculsalaire(){
        int taille=employe.size()-1;
        while (taille>=0){
            System.out.println(employe.get(taille).getNom() + " à pour salaire " + employe.get(taille).calculsalaire() + " Fcfa");
            taille--;
        
    }
  }
    
   

}