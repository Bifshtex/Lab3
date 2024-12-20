public abstract class FruitsAndVegetables {
    public FruitsAndVegetables(boolean availabilityOfAwl, String name) {
        this.availabilityOfAwl = availabilityOfAwl;
        this.name=name;
    }
    private String name;
    private  boolean availabilityOfAwl;
    public void setAvailabilityOfAwl(boolean availabilityOfAwl){
        this.availabilityOfAwl = availabilityOfAwl;
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
