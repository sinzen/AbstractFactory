public class Main {

    public static void main(String[] args) {


        FabriqueVehiculeEssence autoE = new FabriqueVehiculeEssence();
        AutomobileEssence ate = (AutomobileEssence) autoE.creerAutomobile("mercedes","rouge","3.0L","Berline");
        System.out.println(ate.afficherCaracteristique());

        FabriqueVehiculeElectrique fsce = new FabriqueVehiculeElectrique();
        ScooterElectrique sce = (ScooterElectrique) fsce.creerScooter("Piaggo","Blanc","125");
        System.out.println(sce.afficherCaracteristique());

        FabriqueVehiculeElectrique autoElec = new FabriqueVehiculeElectrique();
        AutomobileElectrique autoElectrique = (AutomobileElectrique) autoElec.creerAutomobile("BMW","NOIR","3.5L","SPORT");
        System.out.println(autoElectrique.afficherCaracteristique());

        FabriqueVehiculeEssence scElectrique = new FabriqueVehiculeEssence();
        ScooterEssence scooterElectrique = (ScooterEssence) scElectrique.creerScooter("HONDA","BLEU","50CC");
        System.out.println(scooterElectrique.afficherCaracteristique());



    }
}
