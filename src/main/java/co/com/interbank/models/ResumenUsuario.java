package co.com.interbank.models;

import java.util.List;

public class ResumenUsuario {

    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<Usuario> data;

    public int getPage() {
        return page;
    }

    public int getPor_page() {
        return per_page;
    }

    public int getTotal() {
        return total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public List<Usuario> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "resumen{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", total_pages=" + total_pages +
                ", data=" + data +
                '}';
    }
}
