## Synopsis

Part of studying Java, this uncompiled Java 8 program can interpret a flat node-file and construct an interactive decision tree, all from cmd line.

## Code Example

A file like this is expected: (currently need to hard-code the location of the file in NodeArray.java, line #12)

```
N2, Is de rand van het blad te omschrijven als gezaagd of gekarteld?
N6, Es
N5, Is het blad gelobd of heeft het blad lobben?
N7, Els
N8, Esdoorn
N9, Berk
N0, Eik
N3, Is de rand dubbel gezaagd ipv enkelvoudig gezaagd?
NA, Beuk
N5, NA, Nee
N3, N7, Nee
N1, N6, Ja
N1, N2, Nee
N2, N3, Ja
N2, N4, Nee
N4, N5, Ja
N4, N8, Nee
N1, Is het blad samengesteld uit meerdere bladeren?
N4, Is de rand glad of gaaf?
N5, N0, Ja
N3, N9, Ja

```

And upon running will determine what question should be asked first.

```
[ NODE DECISIONTREE ]

Reading nodefile.

N1 - Is het blad samengesteld uit meerdere bladeren?
Mogelijke antwoorden: [Ja, Nee]

> Ja

Het blad is een Es

```

Thus walking through the decision tree, finally responding with the resulting leaf (in this case).

## Motivation

To easily generate a interactive program that can interpret a flat node file, this program was constructed. 

## Installation

Should be compiled before use. .jar pending
