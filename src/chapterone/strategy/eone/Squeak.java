package chapterone.strategy.eone;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I can Squeak");
    }
}
