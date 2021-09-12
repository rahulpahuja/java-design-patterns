package chapterone.strategy.eone;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I cannot Quack, I am a Muted Duck");
    }
}
