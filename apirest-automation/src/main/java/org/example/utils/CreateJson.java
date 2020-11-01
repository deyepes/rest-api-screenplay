package org.example.utils;

import org.example.models.Datalist;
import org.example.models.Json;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CreateJson {

    private CreateJson() {
        throw new IllegalStateException("Utility class");
    }

    public static String createJsonWith(Json json) {
        Datalist<Json> data = new Datalist<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        data.setData(json);
        return gson.toJson(data);
    }
}
