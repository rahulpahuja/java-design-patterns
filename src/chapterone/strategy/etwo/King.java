package chapterone.strategy.etwo;

public class King extends Character{

    @Override
    public void fight() {
        System.out.println("I can fight");
    }

    @Override
    public void display() {
        System.out.println("I am King");
    }
}

