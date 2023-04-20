public class Wolf extends Predator {

    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "'Uuuuu'";
    }

    @Override
    public String toString() {

        return String.format("Wolf %s", super.toString());
    }
}
