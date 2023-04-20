public class main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addList(new Wolf("Carlos"))
            .addList(new Rabbit("Rojer"));
        // for (int i = 0; i < zoo.getListAnimal().size(); i++) {
        //     System.out.println(zoo.getListAnimal().get(i));
        // }

        for (var item : zoo.getListAnimal()) { // return the list of animals with their features
            System.out.println(item);
        }

        for (var item : zoo.getListAnimal()) { // return the sounds the animals do
            System.out.println(item.say());
            
        }

    }
    
}