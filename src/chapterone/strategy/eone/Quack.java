package chapterone.strategy.eone;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I can Quack");
    }
}
