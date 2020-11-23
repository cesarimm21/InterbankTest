package co.com.interbank.util;

public enum RestService {

    BASE_URL("https://reqres.in/api"),
    LIST_USERS("/users"),
    SINGLE_USER("/users?page=%d"),
    LIST_RESOURCE("/unknown"),
    SINGLE_RESOURCE("/unknown/%d"),
    CREATE("/users"),
    PUT_UPDATE("/users/%d");

    private String uri;

    RestService(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }
}
