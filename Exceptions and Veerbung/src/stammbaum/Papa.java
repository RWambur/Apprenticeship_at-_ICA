package stammbaum;

public class Papa  extends Opa {

    public Papa(String nachname) {
        super(nachname);
    }

    @Override
    public String getNachname() {
        return "LOL";
    }
}
