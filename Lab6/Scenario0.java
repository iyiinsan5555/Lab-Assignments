public class Scenario0 {
    public static void main(String[] args) {

        int[] myArr = {4, 8, 15, 16, 23, 42};

        /*

        a. What is the length of myArr?
        Its length is 6. You can get its length with array.length property.

        b. What is the value of the first element?
        First element's value is 4. You can access it by writing myArr[0].

        c. What is the index value of the last element?
        Index of last element is (length - 1) --> 5. myArr[5]

        d. What is the value of the third element?
        Its value is 15. You can reach it by writing myArr[2]

        e. What is the value of myArr[3]?
        Its 16. Its not the third element. Its fourth element.

       f. If we try to access myArr[10], what happens?
       It will give error. "ArrayIndexOutOfBoundsException"

         */


        System.out.println("Length of array is: " + myArr.length);
        System.out.println("The value of first element is: " + myArr[0]);
        System.out.println("Index of last element is: " + (myArr.length - 1));
        System.out.println("The value of third element is: "+ myArr[2]);
        System.out.println("The value of myArr[3] is: " + myArr[3]);
        System.out.println(myArr[10]); //It's going to give ArrayIndexOutOfBoundsException. Because we are trying to access an index that we didn't create.

    }
}
