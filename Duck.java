public class Duck extends Herbivores implements Walk, Flying, Swimming {

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

    @Override
    public int speedForFlying() {
        return 80;
    }

    @Override
    public int speedForWalk() {
        return 10;
    }

    @Override
    public int speedForSwimming() {
        return 50;
    }
}
