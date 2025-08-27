import java.util.Arrays;

class ResistorColorDuo {
    private final String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int value(String[] colors) {
        String value = "";
        for (String color : colors) {
            value += String.valueOf(Arrays.asList(this.colors).indexOf(color));
        }
        return Integer.parseInt(value.substring(0,2));
    }
}
