import java.util.ArrayList;

public class Chipolino extends FruitsAndVegetables implements Return {
    public Chipolino(boolean availabilityOfAwl) {
        super(availabilityOfAwl, "Чиполино");
    }

    public String phrasef(String h){
        return h;
    }

    public static double politeness = Math.random()*100;
    public static double patience = Math.random()*100;
    //public static double persuasivness = Math.random()*100;
    static ChipolinoCondition chipolinoCondition;


    public void toWait(Chipolino chipolino) throws ChipolinoDoesntWaitException {
        if (chipolino.patience > 20) {
            if ((Math.random() * 100) > 5) {
                System.out.println("Чиполино продолжает ждать");
            } else {
                throw  new ChipolinoDoesntWaitException("Чиполино не дождался и ушёл");
            }
        } else   {
            if ((Math.random() * 100)>60) {
                System.out.println("Чиполино продолжает ждать");
            } else {
                throw  new ChipolinoDoesntWaitException("Чиполино не дождался и ушёл");
            }
        }
    }


    public void chipolinoScreamed(Krot krot, String scream1,String scream2){
        System.out.println(scream1+" - Чиполино закричал "+krot.getName()+"у."+ scream2);
    }


    @Override
    public void sayingPhrase(String phrase) {
        System.out.println(toString() + " сказал: " + phrase);
    }

    public void toListen(MasterGrape masterGrape) {
        System.out.println("Чиполино выслушал " + masterGrape.toString());
    }

    public void askFor(MasterGrape masterGrape) {
        System.out.println("Чиполино попросил у " + masterGrape.toString() + " шило");
    }


    public void setChipolinoCondition(ChipolinoCondition newChipolinoCondition) {
        chipolinoCondition = newChipolinoCondition;
        System.out.println(newChipolinoCondition.getDescription());
    }
    @Override
    public void returnSmth(Chipolino chipolino,MasterGrape masterGrape, SomeObjects smth){
        if(politeness>50){
            masterGrape.setAvailabilityOfSmth(true);
            chipolino.setAvailabilityOfSmth(false);
            System.out.println(chipolino.getName()+" вернул "+ smth.getName()+" "+masterGrape.getName());
            chipolino.sayingPhrase("– Спасибо, я знаю, что делать.");
        }
        else{
            System.out.println(chipolino.getName()+" не вернул шило "+masterGrape.getName()+" и убежал, сказав что все уладит");
        }}


    public void scratching() throws DullAwlException{
        if(Awl.getSharpness()>50){
            if(politeness+20<=100){
                System.out.println("Шило достаточно острое , чиполино почесался");
                politeness+=20;
            }
            else{
                System.out.println("Шило достаточно острое , чиполино почесался");
                politeness=100;
            }

        }else{
            if (politeness>40){
                politeness-=40;
                throw new DullAwlException("Шило слишком тупое, чиполино плохо почесался");
            }
            else{
                politeness-=politeness;
                throw new DullAwlException("Шило слишком тупое, чиполино плохо почесался");
            }
        }
    }

    public double getPoliteness(){
        return politeness;
    }

}