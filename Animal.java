public abstract class Animal extends Organism {
    private final int legs;

    public Animal(int legs) {
        super();
        this.legs = legs;
        System.out.println("Creating animal...");
    }

    public void eat(Plant plant) {
        System.out.printf("%s is eating %s\n", this, plant);
    }

    public int getLegs() {
        return legs;
    }
}
