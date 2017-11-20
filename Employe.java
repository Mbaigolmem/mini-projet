package salaire;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author porpo
 */
public abstract class Employe{
   protected String matricule;    
   protected String nom;
   protected String prenom;
   protected Short age;
   protected String date_entree;
   
   abstract double calculsalaire();
   
   public String getNom(){
       return "L'Employé "+nom + " " + prenom;     
   }
   
    
    public Employe(String matricule,String nom, String prenom,Short age,String date_entree){
       this.matricule=matricule;
       this.nom=nom;
       this.prenom=prenom;
       this.age=age;
       this.date_entree=date_entree;
    }
}
          
   
  