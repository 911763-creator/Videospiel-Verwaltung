Videospiel-Verwaltung

Projektarbeit – Programmiertechnik
Semester: WiSe 2025/26
Hochschule: Hochschule Neu-Ulm

---

Projektbeschreibung

In diesem Projekt haben wir eine Java-Anwendung entwickelt, mit der man eine eigene Videospielsammlung verwalten kann.
Die Anwendung bietet eine grafische Benutzeroberfläche (GUI) auf Basis von Java Swing und ermöglicht es, Spiele anzulegen, zu filtern, zu sortieren und auszuwerten.

Ziel des Projekts war es, objektorientierte Programmierung, GUI-Entwicklung und sauberes Exception Handling praktisch umzusetzen.

---

Funktionen
- Spiele hinzufügen  
  Videospiele können mit Titel, Genre, Altersfreigabe, Multiplayer-Status und Preis gespeichert werden.

- Filtern  
  Spiele lassen sich flexibel nach verschiedenen Attributen durchsuchen (z. B. Genre oder Titel).

- Sortieren  
  Sortierung nach Titel, Genre, Altersfreigabe, Multiplayer oder Preis.

- Gesamtpreis berechnen  
  Berechnet den Gesamtwert der gesamten Spielesammlung.

- Eingabevalidierung  
  Fehlerhafte Eingaben werden durch Exception Handling abgefangen.

- Standardspiele  
  Beim Start sind bereits 5 Beispielspiele hinterlegt.

---

Projektstruktur
```
Videospiel-Verwaltung/
├── src/
│   ├── java/
│   │   └── Spiel.java              # Modellklasse für Videospiele
│   └── VideospielGUI/
│       ├── VideospielGUI.java      # GUI und Hauptlogik
│       └── VideospielGUI.form      # IntelliJ UI Designer Form
├── tests/
│   └── SpielTest.java              # JUnit Tests
├── docs/
│   └── UML_Klassendiagramm.pdf     # UML-Diagramm
└── README.md
```

---

Verwendung

Spiel hinzufügen

1. Felder ausfüllen:
   - Titel – Name des Spiels
   - Genre – z. B. Shooter, Action, Survival
   - Altersfreigabe – 0, 6, 12, 16 oder 18
   - Multiplayer – Checkbox aktivieren, falls vorhanden
   - Preis – Preis in Euro
2. Auf „Speichern“ klicken

---

Filtern

- Suchbegriff in das Filterfeld eingeben
- Auf „Filtern“ klicken
- Beispiel: „Shooter“ zeigt alle Shooter-Spiele

---

Sortieren

- Sortierkriterium aus der Dropdown-Liste auswählen
- Auf „Sortieren“ klicken

---

Gesamtpreis berechnen

- Auf „Berechnen“ klicken
- Der Gesamtwert aller gespeicherten Spiele wird angezeigt

---

Tests

Für die Kernfunktionalität wurden JUnit-Tests implementiert (teilweise noch in Entwicklung).

Getestete Methoden:
- gesamtpreis() – Berechnung des Gesamtpreises
- FilterSpiele() – Filterlogik
- standardspiele() – Initialisierung der Standardspiele
---

Autoren

Krist Tobias  
Martinez Tim

