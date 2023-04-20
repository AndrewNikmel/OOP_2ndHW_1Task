import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listAnimal = new ArrayList<>();

    public List<Animal> getListAnimal() {
        return listAnimal;
    }

    public Zoo addList(Animal animal) {
        listAnimal.add(animal);
        return this;
    }

    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public List<Sayable> getSayable() {
        List<Sayable> sayables = new ArrayList<>();
        for (var item : listAnimal) {
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }

    public List<Walk> walkable() {
        List<Walk> walkable = new ArrayList<>();
        for (var item : listAnimal) {
            if (item instanceof Walk) {
                walkable.add((Walk) item); // приведение (var) item into (walk)
            }
        }
        return walkable;
    }

    public List<Flying> flyable() {
        List<Flying> flyable = new ArrayList<>();
        for (var item : listAnimal) {
            if (item instanceof Flying) {
                flyable.add((Flying) item); // приведение (var) item into (walk)
            }
        }
        return flyable;
    }

    public Walk winnerWalk(){
        int index = 0;
        for (int i = 0; i < walkable().size(); i++) {
            if(walkable().get(i).speedForWalk() > walkable().get(index).speedForWalk()){
                index = i;
            }
        }
        return walkable().get(index);
    }

    public Flying winnerFlying(){
        int index = 0;
        for (int i = 0; i < flyable().size(); i++) {
            if(flyable().get(i).speedForFlying() > flyable().get(index).speedForFlying()){
                index = i;
            }
        }
        return flyable().get(index);
    }

}
