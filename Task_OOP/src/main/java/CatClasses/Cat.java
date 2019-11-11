package CatClasses;

import ICats.IPlayable;

public abstract class Cat implements IPlayable {
    protected String name;
    protected String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public abstract String ShowInfo();
}
