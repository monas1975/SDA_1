package zadanieFirma.reader;

//import com.sun.javaws.exceptions.
import zadanieFirma.Pracownik;

import java.util.Objects;

public abstract class EmployeeReader {
    private String path;

    protected EmployeeReader(String path){
        if(path==null){
            throw new NullPointerException("path not found");
        }
        this.path = Objects.requireNonNull(path);
    }

    public String getPath(){
        return path;
    }

    public abstract Pracownik[] odczytajPracownikow();
}
