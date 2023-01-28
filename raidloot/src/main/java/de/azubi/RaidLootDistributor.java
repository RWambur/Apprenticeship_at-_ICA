package de.azubi;

public class RaidLootDistributor {
    public boolean fairRaidLootDistributor(int goldCoins, int partyMembers) {
        int goldCoinsToBeDistributed = goldCoins / 2;
        return goldCoinsToBeDistributed % partyMembers == 0;
    }
}
