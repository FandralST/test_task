import animals.Kotik;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        Kotik firstKotik = new Kotik("Cat1", "meow", 5, 5);

        Kotik secondKotik = new Kotik();
        secondKotik.setName("Cat2");
        secondKotik.setVoice("gav");
        secondKotik.setSatiety(10);
        secondKotik.setWeight(6);

        String[] firstKotikActions = firstKotik.liveAnotherDay();
        for (String action : firstKotikActions) {
            System.out.println(action);
        }
        System.out.println("Имя и вес второго котика");
        System.out.println(secondKotik.getName());
        System.out.println(secondKotik.getWeight());
        System.out.println("Сравнение голосов");
        System.out.println(compareVoice(firstKotik, secondKotik));
        System.out.println("Количество котиков");
        System.out.println(firstKotik.getCount());
    }

    static boolean compareVoice(Kotik kotik1, Kotik kotik2){
        return kotik1.getVoice().equals(kotik2.getVoice());
    }

}
