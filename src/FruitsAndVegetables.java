public abstract class FruitsAndVegetables {
    public FruitsAndVegetables(boolean availabilityOfSmth, String name) {
        this.availabilityOfSmth = availabilityOfSmth;
        this.name=name;
    }
    private String name;
    private  boolean availabilityOfSmth;
    public void setAvailabilityOfSmth(boolean availabilityOfSmth){
        this.availabilityOfSmth = availabilityOfSmth;
    }


    public abstract void sayingPhrase(String phrase);

    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return getName();
    }

}
