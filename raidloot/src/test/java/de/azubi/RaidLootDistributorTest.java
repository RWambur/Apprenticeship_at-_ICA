package de.azubi;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RaidLootDistributorTest {

    private RaidLootDistributor sut;

    @BeforeEach
    void setUp() {
        this.sut = new RaidLootDistributor();
    }

    @Test
    void RaidLootDistribution_EqualNumber_ShouldReturnTrue() {
        int goldCoins = 100000;
        int partyMembers = 5;
        boolean expected = true;

        boolean result = sut.fairRaidLootDistributor(goldCoins, partyMembers);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void RaidLootDistribution_UnequalNumber_ShouldReturnFalse() {
        int goldCoins = 28065;
        int partyMembers = 3;
        boolean expected = false;

        boolean result = sut.fairRaidLootDistributor(goldCoins, partyMembers);

        assertThat(result).isEqualTo(expected);
    }
}
