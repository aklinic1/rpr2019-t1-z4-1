package ba.unsa.etf.rpr;
///Kupac na početku dobija praznu korpu, te u nju može ubacivati i iz nje izbacivati artikle.
//Ukoliko kupac želi ubacivati u korpu potrebno je ispisati sve artikle sa kodovima, te se unosi adekvatan kod za
// ubacivanje u korpu. Analogno za izbacivanje iz korpe je potrebno ispisati sve produkte koji se trenutno nalaze u korpi
// sa kodovima. Pri ubacivanju u korpu, stanje u supermarketu se mijenja i artikl više nije dostupan. Analogno pri izbacivanju iz
// korpe, artikl se vraća u supermarket. Cilj je implementirati program tako da se transakcije između korpe i supermarketa
// rješavaju preko koda. Kupcu je potrebno omogućiti opciju da se prekine program, odnosno da odustane od kupovine, ili da ide na
// checkout gdje se obračunava potpuni iznos. Plaćanje se vrši unosom pri čemu se validira da li je unesena negativna,
// odnosno dovoljna suma novca.


public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || o.getClass() != this.getClass()) return false;
        Artikl a = (Artikl) o;
        return naziv.equals(((Artikl) o).getNaziv()) && cijena == ((Artikl) o).getCijena()
                && kod.equals(((Artikl) o).getKod());
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
