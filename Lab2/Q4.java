public class Q4 {
    public static void main(String[] args){

        int x = 5;
        System.out.println(x++); // post-increment --> adds after it gets the x value
        System.out.println(++x); // pre-increment --> it adds 2 then println gets it's value, if we use one plus sign it will increase by one

        int a = 3;
        int b = a++ + ++a + a--; // b = 4 + 5 + 4
        System.out.println("a = " + a + ", b = " + b);

        // a++ --> a becomes 4 but assigned as 3
        // + ++a --> a becomes 5 and assigned as 5
        // + a--  --> a becomes 4 but assigned as 5

    }
}
