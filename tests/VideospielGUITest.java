import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VideospielGUITest {

    //Test 1: Testet die gesamtpreis() Methode

    @Test
    public void testGesamtpreis() {

        VideospielGUI gui = new VideospielGUI();

        double ergebnis = gui.gesamtpreis();

        assertEquals(119.96, ergebnis, 0.01); //Toleranz mit Hilfe von KI erarbeitet
    }


    //Test 2: Testet ob die Anzahl der Standardspiele korrekt ist

    @Test
    public void testAnzahlStandardspiele() {

        VideospielGUI gui = new VideospielGUI();

        assertEquals(5, gui.spieleListe.size());
    }

    //Test 3: Test: Testet die enthaeltZahlen() Methode

    @Test
    public void testEnthaeltZahlen() {
        VideospielGUI gui = new VideospielGUI();

        assertTrue(gui.enthaeltZahlen("Shooter123"));

        assertFalse(gui.enthaeltZahlen("Shooter"));

        assertTrue(gui.enthaeltZahlen("123"));

        assertTrue(gui.enthaeltZahlen("5Shooter"));
    }
    }