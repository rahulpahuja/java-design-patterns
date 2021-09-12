package chapterone.strategy.etwo;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using Sword");
    }
}
