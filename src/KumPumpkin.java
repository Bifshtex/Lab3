public class KumPumpkin extends FruitsAndVegetables{
    public KumPumpkin(boolean availabilityOfAwl){
        super(availabilityOfAwl, "Кум Тыква");
    }
    @Override
    public void sayingPhrase(String phrase){
        System.out.println( toString()+" сказал со вздохом: "+phrase);
    }


}
