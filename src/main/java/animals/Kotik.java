package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kotik {

    private static int count;

    private static final int METHODS = 5;

    private String name;

    private String voice;

    private int satiety;

    private int weight;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public boolean play() {
        if (!checkSatiety()) {
            return false;
        }
        System.out.println("LETS PLAY!");
        this.satiety--;
        return true;
    }

    public boolean sleep() {
        if (!checkSatiety()) {
            return false;
        }
        this.satiety--;
        System.out.println("BEDTIME!");
        return true;
    }

    public boolean wash() {
        if (!checkSatiety()) {
            return false;
        }
        this.satiety--;
        System.out.println("WASHING!");
        return true;
    }

    public boolean walk() {
        if (!checkSatiety()) {
            return false;
        }
        this.satiety--;
        System.out.println("WALKING!");
        return true;
    }

    public boolean hunt() {
        if (!checkSatiety()) {
            return false;
        }
        this.satiety--;
        System.out.println("HUNTING!");
        return true;
    }


    private boolean checkSatiety() {
        if (this.satiety <= 0) {
            System.out.println("GIVE ME SOME FOOD PLS");
            return false;
        }
        return true;
    }

    public void eat(int foodQuantity) {

    }

    public void eat(int foodQuantity, String foodName) {
        this.satiety += foodQuantity;
    }

    public void eat() {
        eat(4, "whiskas");
    }


    public String[] liveAnotherDay() {
        int action = 0;
        Random rnd = new Random();
        String actionName = "foo";
        String[] hourActionsArray = new String[24];
        for (int i = 0; i < 24; i++) {
            action = rnd.nextInt(5) + 1;
            switch (action) {
                case 1:
                    if (!play()) {
                        eat();
                        actionName = "eat";
                    } else actionName = "play";
                    break;

                case 2:
                    if (!sleep()) {
                        eat();
                        actionName = "eat";
                    } else actionName = "sleep";
                    break;

                case 3:
                    if (!wash()) {
                        eat();
                        actionName = "eat";
                    } else actionName = "wash";
                    break;

                case 4:
                    if (!hunt()) {
                        eat();
                        actionName = "eat";
                    } else actionName = "hunt";
                    break;

                case 5:
                    if (!walk()) {
                        eat();
                        actionName = "eat";
                    } else actionName = "walk";
                    break;
            }
            hourActionsArray[i] = i + " - " + actionName;
        }

        return hourActionsArray;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

}
