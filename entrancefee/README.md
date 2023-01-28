# Kino Eintrittspreis Berechner
#### Berechnet werden soll der finale Preis nach den variablen der Altersermäßigungen und den Reihenzuschlag.

## Test Klasse
### EntranceFeeCalculatorTest
- Zuerst werden Preis, Alter und Reihe um den Ticketpreis auszurechnen festgelegt.
- Dann werden diese Werte der Methode EntranceFeeCalculator übergeben.
- Am Ende wird geprüft, ob das Ergebnis der Methode mti dem Ergebnis der Test Methode übereinstimmt.

## Klasse
### EntranceFeeCalculator
- Das Alter der Person wird abgefragt, darauf hin wird der neue preis auf grundlage bestimmter ermäßigungen ausgerechnet.
- Dann wird die Reihe in dem die Person sitzen wird ausgesucht, der vorher ausgerechnete preis wird nun mit den neuen ermäßigungen, oder zuschlag ausgerechnet.
- Der Finale Preis wird ausgegeben.