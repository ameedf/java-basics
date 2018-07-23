package com.ameed;

import java.util.Objects;

public class Language {
    private String name;
    private int popularity;

    public Language() {
        this("Java", 100);
    }

    public Language(String name, int popularity) {
        setName(name);
        setPopularity(popularity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() > 50) {
            System.out.println("ERROR: name must have 50 charecters maximum");
        } else {
            this.name = name;
        }
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        if (popularity >= 0 && popularity <= 100) {
            this.popularity = popularity;
        } else {
            System.out.println("ERROR: popularity should be in the range [0..100]");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Language)) {
            return false;
        }
        Language language = (Language)o;
        return popularity == language.popularity &&
                Objects.equals(name, language.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, popularity);
    }
}
