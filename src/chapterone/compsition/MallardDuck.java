package chapterone.compsition;

public class MallardDuck extends Duck{
    public MallardDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        //super.display();
        System.out.println("I am a Mallard Duck");
    }
}
