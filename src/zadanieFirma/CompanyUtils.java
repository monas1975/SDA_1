package zadanieFirma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CompanyUtils {

    /**
     * Zapisuje pracownikow do pliku .txt
     *
     * @param pracownicy
     * @param path
     * @return Zwraca status operacji - true jeśli udało się zapisać, badz false w przeciwnym przypadku
     */


    public static boolean zapiszPracownikow(Pracownik[] pracownicy, String path) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
            for (int i = 0; i < pracownicy.length; i++) {
                Pracownik pracownik = pracownicy[i];
                if (pracownik != null) {
                    writer.write(pracownik.toString() + "\n");
                }
            }
            return true;
        } catch (IOException e) {
            return false;
        }

    }

    public static Pracownik[] odczytajPracownikow(String sciezka) {
        Pracownik[] wynik = new Pracownik[100];

        try{
            //odcytujemy z pliku
            BufferedReader reader = Files.newBufferedReader(Paths.get(sciezka));
            String line = null;
            int index = 0;
         //   for(String line2=reader.readLine();line2!=null;line= reader.readLine()){
         //       System.out.println(line2);
         //   }
            while ((line = reader.readLine()) != null) {
                //to do: delate this
                System.out.println(line);
                //todo: zaimplementuj utworzenie obiektu Pracownik z lini z pliku
                String[] split = line.split(",");
                Pracownik pracownik = new Pracownik(split[1], split[2]);
                pracownik.setEmail((split[3]));
                pracownik.setAdres((split[4]));
                pracownik.setPensja(Double.valueOf(split[5]));;
                wynik[index++] = pracownik;
                return wynik;
                //id slit[0]
                //imie split[1]
                //nazwisko split[2]
                //email split[3]
            }
        } catch (IOException e) {
            return new Pracownik[100];
        }
        return null;
    }
}
