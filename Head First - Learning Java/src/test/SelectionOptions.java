package test;

public enum SelectionOptions {
    SCHERE(1, "Schere"), // 0
    STEIN(2, "Stein"), // 1
    PAPIER(3, "Papier"), // 2
    RAKETE(10000, "Rakete"); //3


    SelectionOptions(int weight, String prettyPrint) {
        this.weight = weight;
        this.prettyPrint = prettyPrint;
    }

    private int weight;
    private String prettyPrint;

    public int getWeight() {
        return weight;
    }

    public String getPrettyPrint() {
        return prettyPrint;
    }
}
