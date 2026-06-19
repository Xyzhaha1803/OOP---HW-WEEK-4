/* Base class GameCharacter: field name, method attack()
Subclasses:
Warrior: override attack() to return melee damage
Archer: uses arrowCount
Mage: uses mana
Override attack() in each and demonstrate use via polymorphic method calls.
File: GameCharacters.java. */

class GameCharacter {
    public String name;

    public int attack(){
        return 1;
    }
}

class Warrior extends GameCharacter {
    public int totalDamage = 0;

    public Warrior(String n){
        this.name = n;
    }

    @Override
    public int attack(){
        int damage = 15;
        return damage;
    }
}

class Archer extends GameCharacter {
    public int arrowCount;
    public int totalDamage = 0;

    public Archer(String n, int aC){
        this.name = n;
        this.arrowCount = aC;
    }

    @Override
    public int attack(){
        int damage = 25;
        arrowCount -= 1;

        return damage;
    }
}

class Mage extends GameCharacter {
    public int mana;
    public int totalDamage = 0;

    public Mage(String n, int m){
        this.name = n;
        this.mana = m;
    }

    @Override
    public int attack(){
        int damage = 50;
        mana -= 20;

        return damage;
    }
}

public class GameCharacters {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("John Snow");
        Archer archer = new Archer("Robin Hood", 10);
        Mage mage = new Mage("Vold",100);

        int warriorDamage = warrior.attack();
        int archerDamage = archer.attack();
        int mageDamage = mage.attack();

        System.out.println("The warrior dealt " + warriorDamage + " damage.");
        System.out.println("The archer dealt " + archerDamage + " damage and has " + archer.arrowCount + " arrows left over");
        System.out.println("The mage dealt " + mageDamage + " damage and has " + mage.mana + " mana remaining.");
    }
}
