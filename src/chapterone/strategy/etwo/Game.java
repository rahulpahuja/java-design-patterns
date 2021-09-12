package chapterone.strategy.etwo;

public class Game {
    public static void main(String[] args) {
        King king = new King();
        king.setWeaponBehavior(new SwordBehavior());
        Queen queen = new Queen();
        queen.setWeaponBehavior(new KnifeBehavior());
        Knight knight = new Knight();
        knight.setWeaponBehavior(new BowAndArrowBehavior());

        Troll troll = new Troll();
        troll.setWeaponBehavior(new AxeBehavior());

        useCharacter(queen);
        useCharacter(king);
        useCharacter(knight);
        useCharacter(troll);
    }

    public static void useCharacter(Character character){

        character.display();
        character.fight();
        character.useWeapon();
    }

}
