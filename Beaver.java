public class Beaver extends Predator implements Walk, Swimming {

    // is the part of the homework, other added lines are marked with "//hw"

    public Beaver(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "'Where are your trees?'";
    }

    @Override
    public String toString() {

        return String.format("Beaver %s", super.toString());
    }

    @Override
    public int speedForWalk() {
        return 30;
    }

    @Override
    public int speedForSwimming() {
        return 70;
    }
}
