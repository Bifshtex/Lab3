import java.util.ArrayList;

public class Krot implements HelpChipolino {
    //public static double politeness = Math.random()*100;
    public static double stubborn = Math.random()*100;
    //public static double permissive = Math.random()*100;

    String name;

    @Override
    public void helpChipolino(Chipolino chipolino,MasterGrape masterGrape, SomeObjects smth){
        System.out.println("Чиполино смог убедить крота.\nКрот всё же помог Чиполино.");
    }

    public String getName(){
        return name;
    }

    public Krot(){
        this.name="Крот";
    }


    public ArrayList<Bumps> amountOfBumps = new ArrayList<>();

    public void createBugor(Chipolino chipolino) {
        int i = 1;
        Bumps bumps;
        do {
            String randomName = "Bump" + i;
            int randomQuantity = (int) (Math.random()*15);
            bumps = new Bumps(randomName, randomQuantity);
            amountOfBumps.add(bumps);
            System.out.println(bumps.name()+ " появился");
            chipolino.toWait(chipolino);
            i++;
        }
        while (bumps.quantity() < 10);
        bumps.appear();
    }


    public void sayingsmth(String mood, String speak, Chipolino chipolino, Krot krot){
        switch(mood){
            case "Сердито":
                System.out.println(krot.getName()+ " сердито ответил "+chipolino.getName()+": "+speak);
                break;
            case "Сухо":
                System.out.println(krot.getName()+" сухо ответил: "+speak);
                break;
            case "Обычно":
                System.out.println(krot.getName()+" сказал: " + speak);
                break;
        }
    }
}


