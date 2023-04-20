public abstract class Animal {
    private String Name;

    public abstract String say();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Name %s; Says %s", Name, say());
    }
}
