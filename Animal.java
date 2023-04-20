public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract String say();

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name %s; Says %s, Eats %s", name, say(), feed());
    }
}
