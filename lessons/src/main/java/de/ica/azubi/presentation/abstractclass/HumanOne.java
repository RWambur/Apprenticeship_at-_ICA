package de.ica.azubi.presentation.abstractclass;

public class HumanOne extends HumanAbstract{
    @Override
    protected String gender() {
        return "Male";
    }

    @Override
    protected String name() {
        return "Reiner Zufall";
    }

    @Override
    protected int age() {
        return 54;
    }

    @Override
    protected double weight() {
        return 102.5;
    }
}
