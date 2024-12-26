public class MasterGrape extends FruitsAndVegetables implements HelpChipolino {
    //public static boolean greediness = true;
    public MasterGrape(boolean availabilityOfSmth){
        super(availabilityOfSmth, "Мастер Виноградинка");
    }

    @Override
    public void sayingPhrase(String phrase){
        System.out.println("Мастер Виноградинка сказала: "+phrase);
    }

    @Override
    public void helpChipolino(Chipolino chipolino,MasterGrape masterGrape, SomeObjects smth){
        masterGrape.setAvailabilityOfSmth(false);
        chipolino.setAvailabilityOfSmth(true);
        System.out.println("Мастер Виноградинка дала " +smth.getName());



    }
}