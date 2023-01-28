# Raidloot
### Beschreibung
Raidloot

Nach einem Raid in einer WoW Instanz wird vom Raid und dem Raid Leiter eine Menge an X Goldstücken erbeutet.
Die Goldstücke werden nach dem Raid aufgeteilt.
Dabei gilt:
- Der Raid Leiter erhält **immer** die Hälfte der Beute (bei einer ungeraden Zahl an Goldstücken bekommt der Raid Leiter weniger als die Hälfte)
- Alle anderen Raid Teilnehmer sollen **exakt** den gleichen Anteil bekommen

Frage: Geht das immer auf?

### Aufgabenstellung
Es soll eine Funktion implementiert werden die prüft ob die erbeuteten Goldstücke gleichmäßig auf die einzelnen Raid Mitglieder verteilt werden können, unter berücksichtigung des Anteils des Raid Leiters.
Die Funktion soll `true` oder `false` zurück liefern wenn die Goldstücke gleichmäßig aufgeteilt werden können oder nicht. 

1. **Schriftlich** niederschreiben wie die Aufgabe zu lösen / implementieren ist. Dabei grob niederschreiben was die Funktion tun muss.
2. Tests implementieren die die Funktionen der `RaidLootDistributor` Klasse verifizieren
3. Die Klasse `RaidLootDistributor`, basierend auf den Tests, ausimplementieren

Die Tests zu den einzelnen Klassen sind unter `src\test\java` zu implementieren.
Eine leere Test Klasse existiert bereits dort.

### Ziel
Die Aufgabe ist erledigt, sobald
- **alle** Tests implementiert sind.
- **alle** Funktionen implementiert sind
