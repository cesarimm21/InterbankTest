package co.com.interbank.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConverJson {

    private static Gson gson;

    public static <T> T fromJson(String json, Class<T> classOfT){
        gson = getGson();
        return gson.fromJson(json, classOfT);
    }

    private static Gson getGson() {
        if (gson == null){
            gson = new GsonBuilder().create();
        }
        return gson;
    }

}
