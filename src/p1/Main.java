package p1;

public class Main {

    public static void main(String[] args) {

	    // Build a pet cat
        Pet cat1 = new Cat();
        cat1.name = "missy";
        cat1.breed = "short hair";
        cat1.weight = 6;
        cat1.age = 1;

        // Build a pet bird
        Pet bird1 = new Bird();
        bird1.name = "tweety";
        bird1.breed = "conure";
        bird1.weight = 1;
        bird1.age = 2;
        bird1.itCanTalk(bird1);

        // Print info about your pets
        System.out.println(cat1 + "\n\n" + bird1);
    }
}

abstract class Pet {
    String name;
    String breed;
    double weight;
    int age;

    void itCanTalk (Pet arg) {
        Bird bird = (Bird) arg;
        bird.canTalk = true;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}

class Bird extends Pet {
    String vocalize = "Tweet";
    int legs = 2;
    boolean canTalk = false;
    boolean canFly = false;

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Bird{" +
                "vocalize='" + vocalize + '\'' +
                ", legs=" + legs +
                ", canTalk=" + canTalk +
                ", canFly=" + canFly +
                '}';
    }
}

class Cat extends Pet {

    String vocalization = "Meow";
    int legs = 4;
    boolean isNeutered = false;
    boolean isHouseBroken = false;

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public void setHouseBroken(boolean trained) {
        isNeutered = trained;
    }

    // @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cat{" +
                "vocalization='" + vocalization + '\'' +
                ", legs=" + legs +
                ", isNeutered=" + isNeutered +
                ", isHouseBroken=" + isHouseBroken +
                '}';
    }


}
