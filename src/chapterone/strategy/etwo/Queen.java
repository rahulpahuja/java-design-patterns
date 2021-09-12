package chapterone.strategy.etwo;

public class Queen extends Character {

    @Override
    public void fight() {
        System.out.println("I can fight");
    }

    @Override
    public void display() {
        System.out.println("I am Queen");
    }
}
