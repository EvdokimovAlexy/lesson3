package ru.geekbrains.lesson6.infrastructure.persistance;

public abstract class DbContext {
    protected Database database;

    public DbContext(Database database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges() {

        return true;
    }
}

class ModelBuilder {
    public ModelBuilder applyConfiguration(ModelConfigutation configutation) {

        return this;
    }
}