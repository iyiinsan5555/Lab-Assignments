public class Pet {
    private String name;
    private int hunger = 5;
    private int energy = 5;

    public Pet(String name, int hunger, int energy) {
        this.name = name;
        this.hunger = hunger;
        this.energy = energy;
    }

    //Getters and setters
    public String getName() {return this.name;}
    public int getHunger() {return this.hunger;}
    public int getEnergy() {return this.energy;}

    public void setName(String name) {this.name = name;}
    public void setHunger(int hunger) {this.hunger = hunger;}
    public void setEnergy(int energy) {this.energy = energy;}

    //Methods
    public void feed() {
        if (hunger == 0 ) {return;}
        this.hunger -= 1;
        System.out.println("Feed the pet. New hunger level: " + this.hunger);
    }

    public void play() {
        this.hunger += 1;
        System.out.println("Pet is playing. New hunger level: " + this.hunger);
    }

    public void status() {
        System.out.printf("Pet's Name: %s  Hunger: %d  Energy: %d %n", name, hunger, energy);
    }
}
