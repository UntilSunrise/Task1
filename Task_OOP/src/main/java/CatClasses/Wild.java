package CatClasses;

public class Wild extends Cat {

    public void hatePeople(){ }

    @Override
    public String ShowInfo(){
        return "Info about wild cat"
                + "\nWild cat name: " + name
                + "\nBreed: " + breed;
    }
}
