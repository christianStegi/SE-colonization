val duration : Int = 30 * 60
val kwhPerMbMobile : Double = 0.00088
val kwhPerMbFixed : Double = 0.00043
val dataRate_lowQual : Double = 0.3
val dataRate_highQual : Double = 0.6


def computeNrOfMbs(factor: Double, duration: Int) : Double = duration * factor


def energyUsedInDatacenter(nrOfMbs: Double) : Double = 
    val energyPerMb_Datacenter : Double = 0.000072
    energyPerMb_Datacenter * nrOfMbs


def computeImpact(energyPerMb: Double, dataRate: Double, duration: Int) : Double = 
    val nrOfMBs : Double = computeNrOfMbs(dataRate, duration)
    val consumeTransmission: Double = nrOfMBs * energyPerMb
    val factorKgOfCo2PerKwh = 0.5
    (energyUsedInDatacenter(nrOfMBs) + consumeTransmission) * factorKgOfCo2PerKwh
    

/* Result */    
val resultMobile : Double = computeImpact(kwhPerMbMobile, dataRate_highQual, duration)
val resultFixed : Double = computeImpact(kwhPerMbFixed, dataRate_lowQual, duration)
println("resultMobile: " + resultMobile)
println("resultFixed: " + resultFixed)


/* RECHNUNG:
    Verbrauch Datacenter * nrOfMbs
     + Verbrauch Verbindung * nrOfMbs
    das Ganze mal 0.5 für die kg-Co2-Angabe
*/


/*
--------------------------------
Schwierigkeiten:

- habe das Ziel nicht fokussiert
- war entmutigt wegen Planlosigkeit
- habe mich nicht entschieden für einen Programmierstil (funktional vs. OO) und 
    konnte daher nicht vorankommen.
- mit OO-Stil, ohne groß auf die Sichtbarkeit von Variablen zu achten, hätte ich es 
    wohl leicht hinbekommen.


Fazit:

überlegen und festlegen: was ist das Ziel, welches Format soll es haben
    (einfaches Ergebnis oder Textausgabe)

für einen Programmierstil entscheiden bzw. Prioritäten setzen
    Hauptsache Ergebnis vs. sauber programmieren

schlechte (uneindeutige) Variablen-Benennung bringt hat zur Verwirrung geführt.
    Überblick verloren. Ausserdem durch gute Benennung logische Strukturierung möglich.
    Daher nochmal neu benannt. Hats tatsächlich gebracht.


Fragen, die aufgetaucht sind:

nicht so ganz klar, wie sauberer Funktionaler Stil funktioniert.

da Funktionen ja keine Seiteneffekte haben dürfen:
    kann ich Funktionen Funktionen als Argumente übergeben?
    Auch diese "pointer" können doch anders zugewiesen werden

meine Antwort: Funktion einer "val" zuweisen und diese dann übergeben. So sollte es 
funktionieren, da vals ja immutable sind.

--------------------------------
*/

