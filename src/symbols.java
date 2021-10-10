public class symbols {
    char symbol;
    Double freq, lowerfreq, upperfreq;
    static int sizee = 0;

    public symbols(char c, Double d) {
        symbol = c;
        freq = d;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
        sizee++;
    }

    public Double getFreq() {
        return freq;
    }

    public void setFreq(Double freq) {
        this.freq = freq;
    }

    public Double getLowerfreq() {
        return lowerfreq;
    }

    public void setLowerfreq(Double lowerfreq) {
        this.lowerfreq = lowerfreq;
    }

    public Double getUpperfreq() {
        return upperfreq;
    }

    public void setUpperfreq(Double upperfreq) {
        this.upperfreq = upperfreq;
    }

    public int size() {
        return sizee;
    }


}
