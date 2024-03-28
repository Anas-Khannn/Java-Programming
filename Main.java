// Character class
class Character {
    String name;

    public Character(String name) {
        this.name = name;
    }

    // Empty attack method
    public void attack() {
        // To be implemented by subclasses
    }
}

// Warrior class
class Warrior extends Character {
    int strength;

    public Warrior(String name, int strength) {
        super(name);
        this.strength = strength;
    }

    // Warrior's unique attack method
    @Override
    public void attack() {
        System.out.println(name + " attacks with strength " + strength);
    }
}

// Mage class
class Mage extends Character {
    int intelligence;

    public Mage(String name, int intelligence) {
        super(name);
        this.intelligence = intelligence;
    }

    // Mage's unique attack method
    @Override
    public void attack() {
        System.out.println(name + " attacks with intelligence " + intelligence);
    }
}

// Thief class
class Thief extends Character {
    int agility;

    public Thief(String name, int agility) {
        super(name);
        this.agility = agility;
    }

    // Thief's unique attack method
    @Override
    public void attack() {
        System.out.println(name + " attacks with agility " + agility);
    }
}


// Main class
public class Main {
    public static void main(String[] args) {
        // Creating instances of each character type
        Character warrior = new Warrior("John", 10);
        Character mage = new Mage("Alice", 15);
        Character thief = new Thief("Bob", 20);

        // Calling their attack methods using polymorphism
        warrior.attack();
        mage.attack();
        thief.attack();

        // Accessing each character's unique ability using type casting
        if (warrior instanceof Warrior) {
            Warrior w = (Warrior) warrior;
            System.out.println(w.name + " has strength " + w.strength);
        }

        if (mage instanceof Mage) {
            Mage m = (Mage) mage;
            System.out.println(m.name + " has intelligence " + m.intelligence);
        }

        if (thief instanceof Thief) {
            Thief t = (Thief) thief;
            System.out.println(t.name + " has agility " + t.agility);
        }
    }
}
