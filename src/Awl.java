public class Awl extends SomeObjects {
    private static double sharpness;

    public Awl() {
        this.sharpness = Math.random() * 100;
        this.name="Шило";
    }

    public static double getSharpness() {
        return sharpness;
    }



    /*public Awl(String name){
       this.name="Шило";
    }*/




    /* public void scratching() throws DullAwlException{
        if(getSharpness()>50){
            System.out.println("Шило достаточно острое , чиполино почесался");
        }else{
            throw new DullAwlException("Шило слишком тупое, оно не чешет");
        }
    }*/
}
