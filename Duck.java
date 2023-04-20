public class Duck extends Herbivores {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "'Krja-Krja'";
    }

    @Override
    public String toString() {

        return String.format("Duck %s", super.toString());
    }
}
