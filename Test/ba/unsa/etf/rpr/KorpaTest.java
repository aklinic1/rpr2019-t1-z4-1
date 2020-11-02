package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    Korpa korpa;
    @BeforeEach
    void napuniKorpu(){
        int i;
        korpa = new Korpa();
        for(i = 0; i < 10; i++){
            korpa.dodajArtikl(new Artikl("jabuke", 5, String.valueOf(i+1)));
        }
    }

    @Test
    void brojArtikala() {
        korpa.izbaciArtiklSaKodom("5");
        korpa.dodajArtikl(new Artikl("jabuke", 5, "25"));
        korpa.izbaciArtiklSaKodom("25");
        korpa.izbaciArtiklSaKodom("16");
        assertEquals(9, korpa.getBrojArtikala());
    }

    @Test
    void Ubaci51() {
        int i;
        Korpa korpa = new Korpa();
        for (i = 0; i < 50; i++) {
            korpa.dodajArtikl(new Artikl("mlijeko", i + 100, String.valueOf(i + 1)));
        }
        boolean a = korpa.dodajArtikl(new Artikl("mlijeko", 120, "51"));
        assertFalse(a);
    }
}