package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void provjeraEquals(){
        Artikl a = new Artikl("jaja", 5, "11");
        assertAll("TEST",
                () -> assertTrue(a.equals(new Artikl("jaja", 5, "11"))),
                () -> assertFalse(a.equals(new Artikl("ja", 4, "kk")))
        );
    }

}