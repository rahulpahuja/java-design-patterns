package chapterone.strategy.etwo;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using Axe");
    }
}
