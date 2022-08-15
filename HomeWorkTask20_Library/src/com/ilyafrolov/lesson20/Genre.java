package com.ilyafrolov.lesson20;

public class Genre {

    private String genre;

    public Genre() {
    }

    public String getGenre(int id) {
        if (id < 10) {
            return "Detective";
        } else if (id > 9 && id < 100) {
            return "Novel";
        } else if (id > 99 && id < 1000) {
            return "Adventure";
        }
        return "";
    }
}
