public class BookDemo {
    public static void main(String[] args) {

        Book b1 = new Book("My Little Pony", 120);
        Book b2 = b1;

        b1.printBook();

        b2.addPages(20);

        b1.printBook();

        //The pages for both book increased because they were referencing to same data in the memory.
        // When we create an object with new it allocates a space in the memory for that object and object's variable is actually a reference to that object
        //So when I create b2 with referring to b1. Then they were referring to same object. Thus, their both pages values changed.

        Book b3 = new Book("My Little Pony", 120);
        System.out.println(b1);
        System.out.println(b3); //Different memory references
        //Book@33c7353a
        //Book@681a9515
        // They are different because I created them by calling new operator, not with a reference!
        //
        //In conclusion, if you create an object with a new operator it will allocate space in memory and variable name will be its reference point
        //If you create an object with referring another object it will only create a (same) reference to that object.


    }

}
