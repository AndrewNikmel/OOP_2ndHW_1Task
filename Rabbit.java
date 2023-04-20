public class Rabbit extends Herbivores {
    
    public Rabbit(String name){
        super(name);
    }

    @Override
    public String say() {
        return "FyrFyr";
    }

    @Override
    public String toString() {
        
        return String.format("Rabbit %s", super.toString());
    }
}
