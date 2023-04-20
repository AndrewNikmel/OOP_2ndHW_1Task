import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listAnimal = new  ArrayList<>();

    public List<Animal> getListAnimal(){
        return listAnimal;
    }

    public Zoo addList(Animal animal){
        listAnimal.add(animal);
        return this;
    }
}
