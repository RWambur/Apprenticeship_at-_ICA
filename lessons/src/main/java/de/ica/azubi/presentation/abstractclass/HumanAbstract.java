package de.ica.azubi.presentation.abstractclass;

public abstract class HumanAbstract {
    protected abstract String gender();

    protected abstract String name();

    protected abstract int age();

    protected abstract double weight();

    public String talk() {
        return "Na Hör Ma!";
    }
}
