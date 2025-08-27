import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ResistorColorTrio {
    private final List<String> colors = new ArrayList<>(List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"));

    String label(String[] colors) {
        long value = (long) ((this.colors.indexOf(colors[0]) * 10 + this.colors.indexOf(colors[1])) * Math.pow(10,this.colors.indexOf(colors[2])));
        String label = "";
        if (value >= 1_000_000_000) {
            value /= 1_000_000_000;
            label = value + " gigaohms";
        } else if (value >= 1_000_000) {
            value /= 1_000_000;
            label = value + " megaohms";
        } else if (value >= 1_000) {
            value /= 1_000;
            label = value + " kiloohms";
        } else {
            label = value + " ohms";
        }
        return label;
    }
}
