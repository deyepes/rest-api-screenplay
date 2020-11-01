package org.example.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;


public class Datalist<T> implements Serializable {

    private static final long serialVersionUID = -2048521956708998942L;
    @SerializedName("data")
    @Expose
    private List<T> data = new LinkedList<>();

    public List<T> getData() {
        return data;
    }

    public void setData(T datos) {
        data.add(datos);
    }

}
