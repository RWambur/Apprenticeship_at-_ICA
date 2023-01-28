package de.ica.azubi.presentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HumanTest {

    private Human sut;

    @BeforeEach
    void setUp() {
        this.sut = new Human();
    }

    @Test
    void enoughProtein_IsTrue() {
        double protein = 150;
        int bodyWeight = 75;

        boolean result = sut.isEnoughProtein(protein, bodyWeight);

        assertThat(result).isTrue();
    }

    @Test
    void enoughProtein_IsFalse() {
        double protein = 55;
        int bodyWeight = 75;

        boolean result = sut.isEnoughProtein(protein, bodyWeight);

        assertThat(result).isFalse();
    }
}