import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //создание экземпляров класса
        Krot krot = new Krot();
        Chipolino chipolino=new Chipolino(false);
        MasterGrape masterGrape = new MasterGrape(true);
        KumPumpkin kumPumpkin= new KumPumpkin(false);
        Environment environment= new Environment();
        Pea pea=new Pea(false);
        SomeObjects awl = new Awl();


        //1 aбзац
        masterGrape.sayingPhrase('"'+"Чиполино, будь хорошим овощем."+ '"');
        chipolino.toListen(masterGrape);
        chipolino.askFor(masterGrape);
        masterGrape.helpChipolino(chipolino, masterGrape, awl);

        //исключение с шилом
        try {
            chipolino.scratching(); // Пытаемся выполнить действие
        } catch (DullAwlException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


        chipolino.returnSmth(chipolino,masterGrape, awl);
        System.out.println();

        chipolino.setChipolinoCondition(ChipolinoCondition.SEARSCHING);

        kumPumpkin.sayingPhrase("- Ах, ежели Чиполлино говорит,\n" +
                "что он придумал что-то,так будьте спокойны: он скоро все уладит!");
        System.out.println();



        //сцена с кротом
        environment.changePosition();
        chipolino.setChipolinoCondition(ChipolinoCondition.EXPECTATION);
        krot.createBugor(chipolino);
        System.out.println();

        chipolino.setChipolinoCondition(ChipolinoCondition.ONKNEES);

        chipolino.sayingPhrase("- Синьор Крот! Синьор Крот! Это я, Чиполлино.");
        krot.sayingsmth("Сухо","- А, это вы?", chipolino, krot);

        krot.sayingsmth("Обычно","– Признаться, я только наполовину\n" +
                "ослеп после нашей первой встречи. Очевидно, теперь вы намерены снова\n" +
                "предложить мне какое-нибудь подземное путешествие, которое\n" +
                "окончательно лишит меня зрения.",chipolino, krot);

        chipolino.sayingPhrase("– Не говорите так, синьор Крот.\n" +
                "Я никогда не забуду вашей услуги:\n" +
                "благодаря вам я встретился с моими друзьями. Нам удалось выйти на\n" +
                "свободу, и мы нашли временное убежище в пещере неподалёку.");

        krot.sayingsmth("Обычно","– Спасибо за сообщение, но это меня вовсе не интересует. До свидания!",chipolino, krot);

        chipolino.chipolinoScreamed(krot,"– Синьор Крот! Синьор Крот!","\n– Выслушайте меня!");

        krot.sayingsmth("Обычно","– Что ж, говорите, но только, пожалуйста, не воображайте, что я готов\n" +
                "по-прежнему помогать вам в ваших делах.", chipolino, krot);
        chipolino.sayingPhrase("– Дело касается не меня, а нашего деревенского адвоката, которого\n" +
                "зовут Горошком. Его должны повесить завтра утром.");


        krot.sayingsmth("Сердито","– И прекрасно сделают! – сердито ответил Крот. – Я бы с\n" +
                "удовольствием помог затянуть на нём петлю. Терпеть не могу адвокатов, да\n" +
                "и горошек мне не по вкусу.", chipolino, krot);
        System.out.println();




       /* //сцена с помощью
        if(chipolino.patience-krot.stubborn<0){
            System.out.println("Чиполино не смог убедить крота.\nКрот не захотел помогать Чиполино.");
            pea.getHanged(pea);
        }
        else{
            krot.helpChipolino(chipolino,masterGrape);
        }
        */

        Phrase[] phrases= new Phrase[10];
        phrases[0]=new Phrase("Помоги пожалуйста");
        phrases[1]=new Phrase("Только ты можешь помочь");
        phrases[2]=new Phrase("Ну и ладно");
        phrases[3]=new Phrase("Помоги мне");
        phrases[4]=new Phrase("Уже поздно");
        phrases[5]=new Phrase("Как хочешь");
        phrases[6]=new Phrase("Пж");
        phrases[7]=new Phrase("Плиз");
        phrases[8]=new Phrase("Умоляю");
        phrases[9]=new Phrase("Пожалуйста");



        Random random = new Random();

        int randomIndex = random.nextInt(phrases.length);

        Phrase randomPhrases = phrases[randomIndex];







        String g = chipolino.phrasef(randomPhrases.ton());

        if (g.contains("Помоги пожалуйста")|g.contains("Только ты можешь помочь")|g.contains("Умоляю")|g.contains("Пожалуйста")){
            System.out.println(g);
            krot.helpChipolino(chipolino,masterGrape,awl);
        }
        else if (g.contains("Пж")|g.contains("Плиз")|g.contains("Помоги мне")) {
            double r=Math.random()*10;
            if (r>5){
                System.out.println(g);
                krot.helpChipolino(chipolino,masterGrape,awl);
            }
            else{
                System.out.println(g);
                System.out.println("Чиполино не смог убедить крота.\nКрот не захотел помогать Чиполино.");
                pea.getHanged(pea);
            }
        }
        else if (g.contains("Ну и ладно")|g.contains("Уже поздно")|g.contains("Как хочешь")){
            System.out.println(g);
            System.out.println("Чиполино не смог убедить крота.\nКрот не захотел помогать Чиполино.");
            pea.getHanged(pea);
        }

        pea.doSomething(pea);


        //System.out.println( chipolino.shilo());
    }
}