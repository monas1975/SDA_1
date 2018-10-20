package zadanieFirma;

public class Pracownik {
    private static int idGenerator = 1;
    private int id;
    private String imie;
    private String nazwisko;
    private String adres;
    private String email;
    private double pensja;

    public Pracownik(String imie, String nazwisko){
        this.id = idGenerator++;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String toString(){
        return String.format("%d,%s,%s,%s,%s,%f",
               id,
                imie,
                nazwisko,
                email,
                adres,
                pensja

                );
    }

}
