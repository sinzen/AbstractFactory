/**
 * Created by yassirhessane on 4/08/16.
 */
public class FabriqueVehiculeElectrique implements FabriqueVehicule {


    private String modele;
    private String couleur;
    private String puissance;
    private String espace;

    @Override
    public Automobile creerAutomobile(String modele, String couleur, String puissance, String espace) {
        return new AutomobileElectrique(modele,couleur,puissance,espace);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, String puissance) {
        return new ScooterElectrique(modele,couleur,puissance);
    }
}
