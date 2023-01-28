# DoubleChar
## Test Klasse
### doubleChar_ShouldReturnPositive/Negative/Zero
- String wird festgelegt.
- Festgelegte Werte werden der Methode minMaxDigits übergeben.
- Check, ob das Ergebnis was erwartet wird auch in der Methode wo Werte übergeben wurden korrekt sind.

## Klasse DoubleChar
### doubleChar
- Zuerst wird gecheckt, ob die länge von Strings durch zwei teilbar sind, um zu prüfen, ob alle Buchstaben doppelt sind.
- Dann geht eine Loop so lange durch das String bis er einen Buchstaben findet, der nicht mit dem davor übereinstimmt.
  - Ausgegeben wird dann die gezählte Stelle an dem die nicht korrekte zahl ist.
  - falls dies nicht der Fall ist, wird 1 ausgegeben, um korrektheit des Strings wiederzugeben.