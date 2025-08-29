class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        for (char nucleotide : dnaStrand.toCharArray()) {
            rnaStrand += switch (nucleotide) {
                case 'G' -> "C";
                case 'C' -> "G";
                case 'T' -> "A";
                case 'A' -> "U";
                default -> "";
            };
        }
        return rnaStrand;
    }
}
