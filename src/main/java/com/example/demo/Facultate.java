package com.example.demo;

import java.util.Objects;

public class Facultate extends Object {
    int id;
    String name;

    public Facultate(int id, String name) {
        this.id=id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Facultate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facultate facultate = (Facultate) o;
        return name.equals(facultate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
