package com.swordie.utils;

public class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\"id\": " + this.id + ",\n\"name\": \"" + this.name + "\"";
    }
}
