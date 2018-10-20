package zadanieFirma;

import sun.plugin.dom.exception.InvalidAccessException;

public class Firma {
    private static final int MAKSYMALNA_LICZBA_PRACOWNIKOW = 100;
    private String nazwaFirma;
    private Pracownik[] pracownicy;
    private int liczbaPracownikow; //aktualna liczba pracownikow

    public Firma(String nazwaFirmy) {
        this.liczbaPracownikow = 0;
        this.nazwaFirma = nazwaFirmy;
        this.pracownicy = new Pracownik[MAKSYMALNA_LICZBA_PRACOWNIKOW];
    }
    //getter dla pola nazwy firmy -> bez settlera

    public String getNazwaFirma() {
        return nazwaFirma;
    }
    //getter dla pola liczby Pracowniko, bez settlera


    public int getLiczbaPracownikow() {
        return liczbaPracownikow;
    }
    //getter dla pracownikow

    public Pracownik[] getPracownicy() {
        return this.pracownicy;
    }

    public boolean dodajPracownika(Pracownik nowyPracownik) {
        if (liczbaPracownikow < MAKSYMALNA_LICZBA_PRACOWNIKOW) {
            pracownicy[liczbaPracownikow++] = nowyPracownik;
            return true;
        }
        return false;
    }
    /**

     * Usuwa pracownika i zwraca referencje do tego pracownika lub zwraca null, jesli nie znaleziono

     *

     * @param id

     * @return usuwanego pracownika lub null jesli nie znaleziono

     */
    public Pracownik usunPracownika(int id){
        // todo: Zaimplementuj kiedy pracownicy będą mieli swoje ID
        Pracownik pracownikDoUsuniecia = null;
        for(int i=0;i<liczbaPracownikow;i++){
            if (pracownicy[i].getId()==id){
                //pracownik znaleziony
                pracownikDoUsuniecia=pracownicy[i];
                pracownicy[i] = null;
                liczbaPracownikow--;
                break;
            }
        }
        //to do napraw tablice
        Pracownik[] nowaTablica = new Pracownik[MAKSYMALNA_LICZBA_PRACOWNIKOW];

        //index -wskaznik w "nowejTablic" na na pierwsze wolne miejsce - zwiekszany tylko, jesli spotkamy pracownika w starej tablicy (a nie null'a)
        int index = 0;
        for(int i=0;i<pracownicy.length;i++){
            if(pracownicy[i]!=null){
                nowaTablica[index] = pracownicy[i];
                index++;
            }
        }
            pracownicy=nowaTablica;
        return pracownikDoUsuniecia;
    }
}


