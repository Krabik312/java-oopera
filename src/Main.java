import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new ArrayList();
        Actor vasily = new Actor("Василий", "Попков", Gender.MALE, 187);
        Actor viktoria = new Actor("Виктория", "Поддубнова", Gender.FEMALE, 165);
        Actor aleksei = new Actor("Алексей", "Каменский", Gender.MALE, 191);
        Director petr = new Director("Petr", "Мовланов", Gender.MALE, 4);
        Director aleksandr = new Director("Александр", "Зюзиков", Gender.MALE, 44);
        Director choreographer = new Director("Степан", "Попов", Gender.MALE, 33);
        Director authorOfMusic = new Director("Влад", "Степнов", Gender.MALE, 14);
        Show simpleShow = new Show("Колобок", 180, petr);
        Opera opera = new Opera("Красная шапочка", 143, aleksandr, authorOfMusic, "Описание постановки красная шапочка", 12);
        Ballet ballet = new Ballet("Щелкунчик", 200, petr, authorOfMusic, "Описание баллета щелкунчик", choreographer);

        simpleShow.addActor(vasily);
        simpleShow.addActor(viktoria);
        opera.addActor(aleksei);
        opera.addActor(viktoria);
        ballet.addActor(vasily);
        ballet.addActor(aleksei);

        simpleShow.printAllActors();
        opera.printAllActors();
        ballet.printAllActors();

        simpleShow.replaceActor(aleksei, "Попков");
        simpleShow.printAllActors();
        opera.replaceActor(vasily, "Завальный");

        opera.printLibretto();
        ballet.printLibretto();
    }
}
