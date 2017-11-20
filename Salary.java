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
public class Salary {
       public static void main(String[] args) {
        Personnel p=new Personnel();
        p.AjouterEmploye(new Vendeur("11B105FS","mbai","joel",(short)23,"13/07/1994",20000));
        p.AjouterEmploye(new Representant("156B105FS","mbai","joel",(short)43,"13/07/1994",50000));
        p.AjouterEmploye(new Production("17B105FS","mbai","joel",(short)13,"13/07/1994",40000));
        p.AjouterEmploye(new Manutention("12B105FS","mbai","joel",(short)63,"13/07/1994",20000));
        p.AjouterEmploye(new ProductionR("14B105FS","mbai","joel",(short)53,"13/07/1994",500000));
        p.AjouterEmploye(new ManutentionR("16B105FS","mbai","joel",(short)33,"13/07/1994",500000));
        
        p.calculsalaire();
        System.out.println("Le salaire moyen des employés de cet entreprise est de " + p.SalaireMoyen() + " francs");
        
    }
}
