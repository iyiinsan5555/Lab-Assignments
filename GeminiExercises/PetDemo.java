public class PetDemo {
    public static void main(String[] args) {
        Pet myPet = new Pet("Buddy", 10, 10);
        myPet.status();
        myPet.play();
        myPet.play();
        myPet.status();
        myPet.feed();
        myPet.status();
    }
}
