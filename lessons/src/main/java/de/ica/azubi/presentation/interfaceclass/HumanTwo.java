package de.ica.azubi.presentation.interfaceclass;

public class HumanTwo implements IHuman {
    @Override
    public String gender() {
        return "female";
    }

    @Override
    public String name() {
        return "Randy Lorde";
    }

    @Override
    public int age() {
        return 54;
    }

    @Override
    public double weight() {
        return 95;
    }

    @Override
    public String talk() {
        return "I AM Lorde.";
    }
}
