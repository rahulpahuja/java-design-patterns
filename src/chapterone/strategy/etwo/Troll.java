package chapterone.strategy.etwo;

public class Troll extends Character {

    @Override
    public void fight() {
        System.out.println("I can't fight");
    }

    @Override
    public void display() {
        System.out.println("I am Troll");
    }
}
