package ru.geekbrains.lesson5;

import java.util.Collection;

public interface Database {
    void load();

    void save();

    public Collection<Entity> getAll();
}