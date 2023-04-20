public class Wolf extends Predator implements Walk {

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

    @Override
    public int speedForWalk() {
        return 30;
    }
}
