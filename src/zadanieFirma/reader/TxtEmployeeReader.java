package zadanieFirma.reader;

import zadanieFirma.CompanyUtils;
import zadanieFirma.Pracownik;

public class TxtEmployeeReader extends EmployeeReader {

    public TxtEmployeeReader(String path){
        super(path);
    }

    @Override
    public Pracownik[] odczytajPracownikow(){
        return CompanyUtils.odczytajPracownikow(getPath());
    }


}
