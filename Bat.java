public class Bat extends Predator implements Flying {

    public Bat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "'I'm the Batman'";
    }

    @Override
    public String toString() {

        return String.format("Bat %s", super.toString());
    }

    @Override
    public int speedForFlying() {
        return 90;
    }
}
