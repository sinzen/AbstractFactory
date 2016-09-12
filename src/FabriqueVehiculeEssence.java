/**
 * Created by yassirhessane on 4/08/16.
 */
public class FabriqueVehiculeEssence implements FabriqueVehicule {

    public String modele;
    public String couleur;
    public String puissance;
    public String espace;


    @Override
    public Automobile creerAutomobile(String modele, String couleur, String puissance, String espace) {
        return new AutomobileEssence(modele,couleur,puissance,espace);

    }

    @Override
    public Scooter creerScooter(String modele, String couleur, String puissance) {
        return new ScooterEssence(modele,couleur,puissance);
    }


}
