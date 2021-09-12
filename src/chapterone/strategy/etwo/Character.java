package chapterone.strategy.etwo;

public abstract class Character {
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void useWeapon(){
        if(weaponBehavior!=null)
        weaponBehavior.useWeapon();
    }

    WeaponBehavior weaponBehavior;
    public abstract void fight();
    public abstract void display();
}
