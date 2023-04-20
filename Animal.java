public abstract class Animal implements Sayable{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    // public abstract String say(); // we added interface sayable, so we do not have to use this method

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name %s; Says %s, Eats %s", name, say(), feed());
    }
}
