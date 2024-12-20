public class MasterGrape extends FruitsAndVegetables implements HelpChipolino {
    //public static boolean greediness = true;
    public MasterGrape(boolean availabilityOfAwl){
        super(availabilityOfAwl, "Мастер Виноградинка");
    }

    @Override
    public void sayingPhrase(String phrase){
        System.out.println("Мастер Виноградинка сказала: "+phrase);
    }

    @Override
    public void helpChipolino(Chipolino chipolino,MasterGrape masterGrape){
        masterGrape.setAvailabilityOfAwl(false);
        chipolino.setAvailabilityOfAwl(true);
        System.out.println("Мастер Виноградинка дала шило");



    }
}