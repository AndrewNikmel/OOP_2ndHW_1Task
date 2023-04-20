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

    private Radio radio;

    public void setRadio(Radio radio){
        this.radio = radio;
    }
    public List<Sayable> getSayable(){
        List<Sayable> sayables = new ArrayList<>();
        for (var item : listAnimal) {
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }
}
