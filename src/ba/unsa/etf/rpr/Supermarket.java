package ba.unsa.etf.rpr;
//Kupac na početku dobija praznu korpu, te u nju može ubacivati i iz nje izbacivati artikle.
//Ukoliko kupac želi ubacivati u korpu potrebno je ispisati sve artikle sa kodovima, te se unosi adekvatan kod za
// ubacivanje u korpu. Analogno za izbacivanje iz korpe je potrebno ispisati sve produkte koji se trenutno nalaze u korpi
// sa kodovima. Pri ubacivanju u korpu, stanje u supermarketu se mijenja i artikl više nije dostupan. Analogno pri izbacivanju iz
// korpe, artikl se vraća u supermarket. Cilj je implementirati program tako da se transakcije između korpe i supermarketa
// rješavaju preko koda. Kupcu je potrebno omogućiti opciju da se prekine program, odnosno da odustane od kupovine, ili da ide na
// checkout gdje se obračunava potpuni iznos. Plaćanje se vrši unosom pri čemu se validira da li je unesena negativna,
// odnosno dovoljna suma novca.
public class Supermarket {
    private final int maxBrojArtkala = 1000;
    Artikl[] artikli = new Artikl[1000];
    private int brojArtikala;

    public Supermarket() {
        brojArtikala=0;
    }

    public boolean dodajArtikl(Artikl artikl){
        if(brojArtikala == maxBrojArtkala) return false;
        artikli[brojArtikala] = artikl;
        brojArtikala++;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public int getBrojArtikala() {
        return brojArtikala;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        if (brojArtikala == 0) return null;
        else {
            Artikl a;
            int i;
            for (i = 0; i < brojArtikala; i++) {
                if (artikli[i].getKod() == kod) {
                    Artikl temp;
                    a = artikli[i];
                    temp = artikli[i];
                    artikli[i] = artikli[brojArtikala - 1];
                    artikli[brojArtikala - 1] = temp;
                    brojArtikala--;
                    return a;
                }
            }
            return null;
        }
    }
}
