import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    // 1. Start a collection
    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    // 2. Grow the collection
    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    // 3. Start trading
    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return myCollection.isEmpty() || theirCollection.isEmpty() ? false: !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    // 4. Identify common cards
    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCardsSet = new HashSet<>(collections.getFirst());

        for (Set<String> collection : collections) {
            commonCardsSet.retainAll(collection);
        }

        return commonCardsSet;
    }

    // 5. All of the cards
    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        for (Set<String> collection : collections) {
            allCards.addAll(collection);
        }
        return allCards;
    }

    /* public static void main(String[] args) {

        // 1. Start a collection
        System.out.println(GottaSnatchEmAll.newCollection(List.of("Newthree", "Newthree", "Newthree"))); // => {"Newthree"}

        // 2. Grow the collection
        Set<String> collection = GottaSnatchEmAll.newCollection(List.of("Newthree"));

        System.out.println(GottaSnatchEmAll.addCard("Scientuna",collection)); // => true
        System.out.println(collection.contains("Scientuna")); // => true

        // 3. Start trading
        Set<String> myCollection = Set.of("Newthree");
        Set<String> theirCollection = Set.of("Scientuna");

        System.out.println(GottaSnatchEmAll.canTrade(myCollection, theirCollection)); // => true

        // 4. Identify common cards
        System.out.println(GottaSnatchEmAll.commonCards(List.of(Set.of("Scientuna"), Set.of("Newthree","Scientuna")))); // => {"Scientuna"}

        // 5. All of the cards
        System.out.println(GottaSnatchEmAll.allCards(List.of(Set.of("Scientuna"), Set.of("Newthree","Scientuna")))); // => {"Newthree", "Scientuna"}

    } */
}
