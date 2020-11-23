package co.com.interbank.util;

public enum SoapService {
    BASE_URL("https://reqres.in/api"),
    CONSULT_BANK("/BLZService");

    private String uri;

    SoapService(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }
}
