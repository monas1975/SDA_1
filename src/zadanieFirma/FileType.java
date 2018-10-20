package zadanieFirma;

public enum FileType {
    TXT("txt"),XML("xml"),JSON("json");
    private String extension;

    FileType(String extension){
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }
}
