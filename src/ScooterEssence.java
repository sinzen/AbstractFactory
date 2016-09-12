/**
 * Created by yassirhessane on 4/08/16.
 */
public class ScooterEssence extends Scooter {

    public ScooterEssence(String modele, String couleur, String puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public String afficherCaracteristique() {
        return "Scooter Essence -> "+this.modele+" : "+this.couleur+" : "+this.puissance;

    }
}
