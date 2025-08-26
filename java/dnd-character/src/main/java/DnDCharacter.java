import java.util.ArrayList;
import java.util.List;

class DnDCharacter {
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    public DnDCharacter() {
        this.strength     = ability(rollDice());
        this.dexterity    = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom       = ability(rollDice());
        this.charisma     = ability(rollDice());
        this.hitpoints    = 10 + modifier(this.constitution);
    }

    int ability(List<Integer> scores) {
        Integer min = 6;
        int sum = 0;

        // First try - 2 loops
       /*  for (int score : scores) {
            min = score < min ? score : min;
        }
        scores.remove(Integer.valueOf(min));

        for (int score : scores) {
            sum += score;
        }

        return sum; */

        // Better way - 1 loop
        for (int score : scores) {
            sum += score;
            min = score < min ? score : min;
        }

        return sum - min;
    }

    List<Integer> rollDice() {
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            scores.add(i, (int)(1 + Math.random() * 6));
        }
        return scores;
    }

    int modifier(int input) {
        return (int)Math.floor((double)(input - 10) / 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
