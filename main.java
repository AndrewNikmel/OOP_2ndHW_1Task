public class main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addList(new Wolf("Carlos"))
                .addList(new Rabbit("Rojer"))
                .addList(new Duck("Donald"))
                .addList(new Bat("Bruce Wayne"));
        // for (int i = 0; i < zoo.getListAnimal().size(); i++) {
        // System.out.println(zoo.getListAnimal().get(i));
        // }

        for (var item : zoo.getListAnimal()) { // return the list of animals with their features
            System.out.println(item);
        }

        for (var item : zoo.getSayable()) { // return the sounds the animals do
            System.out.println(item.say());

        }

        // System.out.println("Walkable are: ");

        for (var item : zoo.walkable()) {
            System.out.printf("%s - %d km/h\n", item.toString(), item.speedForWalk());
        }

        // System.out.println("Flyable are: ");

        for (var item : zoo.flyable()) {
            System.out.printf("%s - %d km/h\n", item.toString(), item.speedForFlying());
        }

        System.out.println("------");
        System.out.printf("Winner in walking is %s", zoo.winnerWalk());
        System.out.println("\n ------");
        System.out.printf("Winner in flying is %s", zoo.winnerFlying());

    }

}