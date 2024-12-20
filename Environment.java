import java.util.ArrayList;

public class Environment {

    Meadow[] meadows = Meadow.values();
    Field[] fields = Field.values();

    private static String position;
    public static void setPosition(String newPosition){
        position = newPosition;
    }
    public static String getPosition(){
        return position;
    }

    public void changePosition(){


            Environment.setPosition(fields[0].getDescription());
            System.out.println(Environment.getPosition());

            Environment.setPosition(fields[1].getDescription());
            System.out.println(Environment.getPosition());



            Environment.setPosition(meadows[0].getDescription());
           System.out.println(Environment.getPosition());

            Environment.setPosition(meadows[1].getDescription());
            System.out.println(Environment.getPosition());

    }


    enum Meadow{
        WITHOUTBUMPSMEADOW("Чиполино находится на луге, не засеянном бугорками"),
        INBUMPSMEADOW("Чиполино находится на луге, засеяном бугорками");
        private final String description;
        Meadow(String description){
            this.description = description;
        }
        public String getDescription(){
            return description;
        }
    }

    enum Field{
        CORNFIELD("Чиполино находится на кукурузном поле"),
        WHEATFIELD("Чиполино находится на пшеничном поле");

        private final String description;

        Field(String description){
            this.description = description;
        }

        public String getDescription(){
            return description;
        }
    }
}