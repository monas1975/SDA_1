package zadanieFirma.reader;

import com.sun.jmx.remote.internal.Unmarshal;
import zadanieFirma.Pracownik;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;

public class XmlEmployeeReader extends EmployeeReader {
    public XmlEmployeeReader(String path) {
        super(path);
    }

        @Override
        public Pracownik[] odczytajPracownikow() {
            try {
                JAXBContext contex = JAXBContext.newInstance(Pracownik.class);
                Unmarshal unmarshaler = (Unmarshal) contex.createUnmarshaller();
              //  Object unmarshal = unmarshaler.unmarshal(new File(getPath()));
                Object um,arshal = unmarshaler.u
            } catch (JAXBException e) {
                e.printStackTrace();
            }

    }
}
