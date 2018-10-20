package zadanieFirma;



import java.util.Scanner;



public class Program {

    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

        System.out.println("Program do zarządzania firmą");

        System.out.println("Podaj nazwę firmy: ");



        String nazwaFirmy = scanner.nextLine();



        Firma firma = new Firma(nazwaFirmy);



        int wybor = -1;

        while (wybor != 0) {

            drukujMenu();

            wybor = scanner.nextInt();

            switch (wybor) {

                case 1:

                    drukujPracownikow(firma);

                    break;

                case 2:

                    dodajPracownika(firma);

                    break;

                case 3:

                    usunPracownika(firma);

                    break;

                case 4:

                    zapiszDoPliku(firma);

                    break;

                case 5:

                    odczytajPracownikow(firma);

                    break;

                default:

                    System.out.println("Nie ma takiej operacji - wybierz ponownie");

                    break;

            }

            System.out.println();

            System.out.println();

        }

    }



    private static void odczytajPracownikow(Firma firma) {

        System.out.println("Podaj sciezkę do pliku");

        String sciezka = scanner.next();

        Pracownik[] pracownicyZPliku = CompanyUtils.odczytajPracownikow(sciezka);

        //todo: jak uaktualnić pracownikow?
        for(Pracownik p : pracownicyZPliku){
            if(p!=null){
                firma.dodajPracownika(p);
            }
        }

    }



    private static void zapiszDoPliku(Firma firma) {

        System.out.println("Podaj ścieżkę do pliku...");

        String sciezka = scanner.next();

        boolean status = CompanyUtils.zapiszPracownikow(firma.getPracownicy(), sciezka);

        // Pierwszy sposób

    /*if (status) {

      System.out.println("Zapis zakończony sukcesem");

    } else {

      System.out.println("Nie udało się zapisac do pliku");

    }*/



        // Drugi sposob

        String tekst = status ? "Zapis zakończony sukcesem" : "Nie udało się zapisac do pliku";

        System.out.println(tekst);



        // 3 sposob to samo co wyżej, bez tworzenia zmiennej

        // System.out.println(status ? "Zapis zakończony sukcesem" : "Nie udało się zapisac do pliku");

    }



    private static void usunPracownika(Firma firma) {

        System.out.println("Podaj id pracownika do usuniecia");

        int idDoUsuniecia = scanner.nextInt();

        Pracownik usunietyPracownik = firma.usunPracownika(idDoUsuniecia);

        if (usunietyPracownik == null) {

            System.out.println("Nie znaleziono takiego pracownika");

            return;

        }

        System.out.println("Pracownik: "

                + usunietyPracownik.getId()

                + ", "

                + usunietyPracownik.getNazwisko()

                + " został usunięty");

    }



    private static void dodajPracownika(Firma firma) {

        System.out.println("Podaj imie");

        String imie = scanner.next();

        System.out.println("Podaj nazwisko");

        String nazwisko = scanner.next();

        System.out.println("Podaj email");

        String email = scanner.next();

        System.out.println("Podaj pensję");

        double pensja = scanner.nextDouble();

        Pracownik nowyPracownik = new Pracownik(imie, nazwisko);

        nowyPracownik.setEmail(email);

        nowyPracownik.setPensja(pensja);

        firma.dodajPracownika(nowyPracownik);

    }



    private static void drukujPracownikow(Firma firma) {

        Pracownik[] pracownicy = firma.getPracownicy();

        if (firma.getLiczbaPracownikow() == 0) {

            System.out.println("Brak pracownikow - wybierz opcję 2, aby dodac nowego");

            return;

        }

        for (int i = 0; i < firma.getLiczbaPracownikow(); i++) {

            Pracownik p = pracownicy[i];

            String opisPracownika = String.format(

                    "Id: %d, Imię: %s, Nazwisko: %s, e-mail: %s, pensja: %f",

                    p.getId(),

                    p.getImie(),

                    p.getNazwisko(),

                    p.getEmail(),

                    p.getPensja()

            );

            System.out.println(opisPracownika);

        }

    }



    private static void drukujMenu() {

        System.out.println("Wybierz operację");

        System.out.println("1. Wypisz wszystkich pracownikow");

        System.out.println("2. Dodaj nowego pracownika");

        System.out.println("3. Usuń pracownika");

        System.out.println("4. Zapisz pracownikow do pliku");

        System.out.println("5. Wczytaj pracownikow z pliku");

        System.out.println("0. Wyjście z programu");

    }

}