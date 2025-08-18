public class GameMaster {

    // 1. Describe a character
    public static String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    // 2. Describe a destination
    public static String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    // 3. Describe the travel method
    public static String describe(TravelMethod travelMethod) {
        return switch (travelMethod) {
            case WALKING -> "You're traveling to your destination by walking.";
            case HORSEBACK -> "You're traveling to your destination on horseback.";
        };
    }

    // 4. Describe a character traveling to a destination
    public static String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    // 5. Describe a character traveling to a destination without specifying the travel method
    public static String describe(Character character, Destination destination) {
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }

    /* public static void main(String[] args) {

        // 1. Describe a character
        Character character = new Character();
        character.setCharacterClass("Wizard");
        character.setLevel(4);
        character.setHitPoints(28);
        System.out.println(new GameMaster().describe(character)); // => "You're a level 4 Wizard with 28 hit points."

        // 2. Describe a destination
        Destination destination = new Destination();
        destination.setName("Muros");
        destination.setInhabitants(732);
        System.out.println(new GameMaster().describe(destination)); // => "You've arrived at Muros, which has 732 inhabitants."

        // 3. Describe the travel method
        System.out.println(new GameMaster().describe(TravelMethod.HORSEBACK)); // => "You're traveling to your destination on horseback."

        // 4. Describe a character traveling to a destination
        System.out.println(new GameMaster().describe(character, destination, TravelMethod.HORSEBACK)); // => "You're a level 4 Wizard with 28 hit points. You're traveling to your destination on horseback. You've arrived at Muros, which has 732 inhabitants."

        // 5. Describe a character traveling to a destination without specifying the travel method
        System.out.println(new GameMaster().describe(character, destination)); // => "You're a level 4 Wizard with 28 hit points. You're traveling to your destination by walking. You've arrived at Muros, which has 732 inhabitants."
    } */
}
