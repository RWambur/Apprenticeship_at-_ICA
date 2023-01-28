Es soll ermittelt werden wie viele 2 €, 1 €, 50-Cent, 20-Cent, 10-Cent, 5-Cent, 2-Cent und 1-Cent benötigt werden um einen Betrag `double value` in Münzen auszuzahlen. 
Die Rückgabe ist eine `Map<K,V>` wobei `K` ein `enum` Wert entsprechend der Münze ist und `V` die Anzahl der benötigten Münzen.

*Beispiel*
Betrag: 12,91

2 €     = 6

1 €     = 0

50 Cent = 1

20 Cent = 2

10 Cent = 0

5 Cent  = 0

2 Cent  = 0

1 Cent  = 1

### ToDos
- Die Klasse ``ValueToCoins`` und die darin enthaltene Methode `toCoins(double value)` implementieren.
- Die Methode liefert eine `Map<K,V>` zurück => einlesen
- Entsprechende Tests implementieren
