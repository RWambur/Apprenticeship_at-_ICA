package foo;

public enum  Articles {

    APFEL("01", 12.5, false), //0
    BIRNE("02", 10.4, true), //1
    PFLAUME("03", 2.5, false), //2
    ORANGE("04", 1.5, true), //3
    WEINTRAUBE("05", 4.0, false), //4
    KIWI("06", 3.2, true), //5
    ANANAS("07", 1.2, false); //6




    Articles(String articleNo, double price, boolean seasonal) {
        this.articleNo = articleNo;
        this.price = price;
        this.seasonal = seasonal;
    }


    private double price;
    private boolean seasonal;
    private String articleNo;

    public double getPrice() {
        return price;
    }

    public boolean isSeasonal() {
        return seasonal;
    }

    public String getArticleNo() {
        return articleNo;
    }

    public String getPrettyLine() {
        // TO DO
        // Implemenmt me
        // result -> "articleNo - price - sesonal: true/false
        return "Artikelnummer: " + getArticleNo() + " | Artikel: " + name() +
                " | Saisonal: " + isSeasonal() + " | Preis: " + getPrice() + "€";
    }
}
