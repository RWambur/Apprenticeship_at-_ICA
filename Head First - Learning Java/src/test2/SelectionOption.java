package test2;

public class SelectionOption {

    SelectionOption(int weight, String prettyPrint) {
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
