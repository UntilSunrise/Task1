import CatClasses.*;

public class Main {

    public static void main(String args[]){

        Cat homeCat = new Home("Vitya");
        Cat wildCat = new Wild();
        homeCat.setName("Vasilek");
        homeCat.setBreed("Persidskiy");
        wildCat.setName("Kysa");
        wildCat.setBreed("manul");

        System.out.println(homeCat.ShowInfo());
        System.out.println(wildCat.ShowInfo());
    }
}
