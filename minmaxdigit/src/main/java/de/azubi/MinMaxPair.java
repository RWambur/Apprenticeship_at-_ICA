package de.azubi;

public class MinMaxPair<L> {

    private final L min;

    public L getMin() {
        return min;
    }

    public L getMax() {
        return max;
    }

    private final L max;

     public MinMaxPair(L min, L max) {
         this.min = min;
         this.max = max;
     }
}
