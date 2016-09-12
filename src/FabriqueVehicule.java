/**
 * Created by yassirhessane on 4/08/16.
 */
public interface FabriqueVehicule {


    public Automobile creerAutomobile(String modele, String couleur, String puissance, String espace);
    public Scooter creerScooter(String modele, String couleur, String puissance);


}
