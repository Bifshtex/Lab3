public class Pea extends FruitsAndVegetables{
    public Pea(boolean availabilityOfAwl){
        super(availabilityOfAwl, "Горошек");
    }
    @Override
    public void sayingPhrase(String phrase){
        System.out.println(toString()+" сказал со вздохом: "+phrase);
    }
    private boolean isAlive=true;

    public void getHanged(Pea pea){
        isAlive=false;
        System.out.println(pea.getName() + " был повешен((((((");
    }



    public void doSomething(Pea pea){
        if(isAlive!=true){
            System.out.println(pea.getName()+" не может ничего делать потому что его повесили(((((((");
        }
        else{
            System.out.println(pea.getName()+" радуется жизни");

        }
    }
}

