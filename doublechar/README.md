# DoubleChar

### Aufgabenstellung
- Es soll eine Methode implementiert werden, die prüft, ob jedes Zeichen im String zweimal hintereinander vorkommt.
  - Ist die Anzahl der Zeichen ungerade => 0 Rückgabewert
  - Kommt jedes Zeichen zwei mal Vor => 0 > Rückgabewert
  - Kommt ein Zeichen nicht zwei mal hintereinander vor => Position mit dem ersten falschen Stelle negiert

1. **Schriftlich** niederschreiben wie die Aufgabe zu lösen / implementieren ist. Dabei grob niederschreiben was die Funktion tun muss.
2. Tests implementieren die die Funktionen der `DoubleChar` Klasse verifizieren
3. Die Klasse `DoubleChar`, basierend auf den Tests, ausimplementieren

### Beispiele
- `methode("kkeevviinn$$aazzuubbii")` => 1
- `methode("bat")` => 0 
- `methode("ddanniieell")` => -3

Die Tests zu den einzelnen Klassen sind unter `src\test\java` zu implementieren.
Eine leere Test Klasse existiert bereits dort.

### Ziel
Die Aufgabe ist erledigt, sobald
- **alle** Tests implementiert sind.
- **alle** Funktionen implementiert sind
