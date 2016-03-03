package p1;

public class Main {

    public static void main(String[] args) {

	    // Build a pet cat
        Pet pet1 = new Cat();
        pet1.name = "missy";
        pet1.breed = "short hair";
        pet1.weight = 6;
        pet1.age = 1;

        // Build a pet bird
        Pet pet2 = new Bird();
        pet2.name = "tweety";
        pet2.breed = "conure";
        pet2.weight = .5;
        pet2.age = 2;

        // Change the pet attribute to talking,
        // but check first if it's a bird
        if (pet2 instanceof Bird)
            pet2.learnedToTalk(pet2);
        else
            System.out.println("Only birds can learn to talk");

        // Print info about your pets
        System.out.println(pet1 + "\n\n" + pet2);
    }
}

abstract class Pet {
    String name;
    String breed;
    double weight;
    int age;

    void learnedToTalk(Pet arg) {
        ((Bird) arg).canTalk = true;
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
