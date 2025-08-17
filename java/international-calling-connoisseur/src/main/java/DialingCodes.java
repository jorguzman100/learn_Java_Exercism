import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private final Map<Integer, String> codes = new HashMap<>();

    // 1. Return the codes in a map
    public Map<Integer, String> getCodes() {
        return codes;
    }

    // 2. Add entries to the dictionary
    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    // 3. Lookup a dialing code's country
    public String getCountry(Integer code) {
        return codes.get(code);
    }

    // 4. Don't allow duplicates
    public void addNewDialingCode(Integer code, String country) {
        if (!(codes.containsKey(code) || codes.containsValue(country))) codes.put(code, country);
    }

    // 5. Find a country's dialing code
    public Integer findDialingCode(String country) {
        for (int code : codes.keySet()) {
            if (country.equals(codes.get(code))) return code;
        }
        return null;
    }

    // 6. Update the country's dialing code
    public void updateCountryDialingCode(Integer code, String country) {
        Integer currentCode = findDialingCode(country);
        if (currentCode != null) {
            codes.remove(currentCode);
            codes.put(code, country);
        }
    }

    /* public static void main(String[] args) {

        // 1. Return the codes in a map
        DialingCodes dialingCodes = new DialingCodes();
        System.out.println(dialingCodes.getCodes()); // => empty map

        // 2. Add entries to the dictionary
        dialingCodes.setDialingCode(679, "Unknown"); // => { 679 => "Unknown" }
        dialingCodes.setDialingCode(679, "Fiji"); // => { 679 => "Fiji" }

        // 3. Lookup a dialing code's country
        dialingCodes.setDialingCode(55, "Brazil");
        System.out.println(dialingCodes.getCountry(55)); // => "Brazil"

        // 4. Don't allow duplicates
        dialingCodes.addNewDialingCode(32, "Belgium");
        dialingCodes.addNewDialingCode(379, "Vatican City");
        // => { 39 => "Italy", 379 => "Vatican City" }
        dialingCodes.addNewDialingCode(32, "Other");
        dialingCodes.addNewDialingCode(39, "Vatican City");
        // => { 32 => "Belgium", 379 => "Vatican City" }

        // 5. Find a country's dialing code
        dialingCodes.addNewDialingCode(44, "UK");
        System.out.println(dialingCodes.findDialingCode("UK")); // => 44
        System.out.println(dialingCodes.findDialingCode("Unlisted")); // => null

        // 6. Update the country's dialing code
        dialingCodes.addNewDialingCode(88, "Japan"); // => { 88 => "Japan" }
        dialingCodes.updateCountryDialingCode(81, "Japan"); // => { 81 => "Japan" }
        dialingCodes.updateCountryDialingCode(32, "Mars"); // => { 81 => "Japan"}

        System.out.println(dialingCodes.getCodes());
    } */
}
