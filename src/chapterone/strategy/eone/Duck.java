package chapterone.strategy.eone;

public abstract class Duck {
    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public Duck() {
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public void performQuack(){
        if(quackBehavior!=null){
            quackBehavior.quack();
        }else{
            System.out.println("Quack Behaviour is Not Set");
        }
    }
    public void performFly(){
        if(flyBehavior!=null){
            flyBehavior.fly();
        }else{
            System.out.println("Fly Behaviour is Not Set");
        }
    }

    public void swim(){
        System.out.println("Hi I am a duck and i can swim");
    }
    public abstract void display();
}
