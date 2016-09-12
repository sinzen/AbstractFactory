/**
 * Created by yassirhessane on 4/08/16.
 */
public class ScooterElectrique extends Scooter {

    public ScooterElectrique(String modele, String couleur, String puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public String afficherCaracteristique() {
        return "Scooter eletrique -> "+this.modele+" : "+this.couleur+" : "+this.puissance;

    }
}
