package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SchoolTaskLoopTest {
    private SchoolTaskLoop sut;

    @BeforeEach
    void setUp() {
        this.sut = new SchoolTaskLoop();
    }

    @Test
    void sumA_ShouldReturnAskedMembers() {
        int g = 16;
        int membersExpected = 6;

        int result = sut.sumA(g);

        assertThat(result).isEqualTo(membersExpected);
    }

    @Test
    void sumB_ShouldReturnAskedMembers() {
        int g = 3;
        int membersExpected = 5;

        int result = sut.sumB(g);

        assertThat(result).isEqualTo(membersExpected);
    }

    @Test
    void sumC_ShouldReturnAskedMembers() {
        int g = 2;
        int membersExpected = 4;
        double result = sut.sumC(g);

        assertThat(result).isEqualTo(membersExpected);
    }

    @Test
    void sumD_ShouldReturnAskedMembers() {
        int g = 16;
        int membersExpected = 4;

        int result = sut.sumD(g);

        assertThat(result).isEqualTo(membersExpected);
    }
}