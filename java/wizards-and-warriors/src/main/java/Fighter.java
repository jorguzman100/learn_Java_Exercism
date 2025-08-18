class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// 1. Create the Warrior class
class Warrior extends Fighter {

    // 2. Describe a Warrior
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    // 3. Make Warriors invulnerable
    @Override
    boolean isVulnerable() {
        return false;
    }

    // 4. Calculate the damage points for a Warrior
    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6 ;
    }
}

// 5. Create the Wizard class
class Wizard extends Fighter {
    boolean preparedSpell;

    // 6. Describe a Wizard
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    // 7. Allow Wizards to prepare a spell and make them vulnerable when not having prepared a spell
    void prepareSpell() { preparedSpell = true; }

    @Override
    boolean isVulnerable() {
        return preparedSpell ? false : true;
    }

    // 8. Calculate the damage points for a Wizard
    @Override
    int getDamagePoints(Fighter fighter) {
        return preparedSpell ? 12 : 3;
    }
}

/*
class Main {
    public static void main(String[] args) {

        // 1. Create the Warrior class
        // 2. Describe a Warrior
        Warrior warrior = new Warrior();
        System.out.println(warrior.toString()); // => "Fighter is a Warrior"

        // 3. Make Warriors invulnerable
        System.out.println(warrior.isVulnerable()); // => false

        // 4. Calculate the damage points for a Warrior
        Wizard wizard = new Wizard();
        System.out.println(warrior.getDamagePoints(wizard)); // => 10

        // 5. Create the Wizard class
        // 6. Describe a Wizard
        System.out.println(wizard.toString()); // => "Fighter is a Wizard"

        // 7. Allow Wizards to prepare a spell and make them vulnerable when not having prepared a spell
        wizard.prepareSpell();
        System.out.println(wizard.isVulnerable()); // => false

        // 8. Calculate the damage points for a Wizard
        System.out.println(wizard.getDamagePoints(warrior)); // => 12
    }
}*/
