# Fair Loot Distributor
## Test Klasse
#### RaidLootDistribution_EqualNumber_ShouldReturnTrue/False
- Gold menge, Party Members und Ergebnis was erwartet wird, werden festgelegt.
- Alles Festgelegte wird in Methode fairRaidLootDistributor übergeben.
- Check, ob das Ergebnis was erwartet wird auch in der Methode wo werte übergeben wurden korrekt ist.
## Klasse RaidLootDistributor
#### fairRaidLootDistributor
- Die menge von Goldmünzen wird durch zwei genommen, um dem Anteil des Führers der Party gerecht zu werden.
- Restliches Geld wird durch alle Party members geteilt.
- Falls die Rechnung aufgeht returned die methode true.