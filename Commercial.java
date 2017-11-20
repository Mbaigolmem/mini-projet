package salaire;

        
public abstract class Commercial extends Employe{
private double ChiffreAffaire;
public Commercial(String matricule,String nom,String prenom,short age,String date_entree,double chiffreAffaire){

    super(matricule,nom,prenom,age,date_entree);
    this.ChiffreAffaire=chiffreAffaire;

}
public double getChiffreAffaire(){
    return ChiffreAffaire;
}
}
        