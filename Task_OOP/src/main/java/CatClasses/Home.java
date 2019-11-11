package CatClasses;

public class Home extends Cat {
    private String master;

    public void layOnSofa(){ }

    public void spoilShoes(){ }

    public Home(String master){
        this.master = master;
    }

    @Override
    public String ShowInfo(){
        return "Info about home cat"
        + "\nMaster: " + master
        + "\nCat name: " + name
        + "\nBreed: " + breed;
    }
}
