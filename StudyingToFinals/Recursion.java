public class Recursion {
    public static void main(String[] args) {
        int testNum = 12;

        int m = recurse(testNum);
        System.out.println(m);

        int n = iterative(testNum);
        System.out.println(n);
    }
    public static int recurse(int a) {
        if(a == 1) return 1;
        return a + recurse(a - 1);
    }

    public static int iterative(int a) {
        int total = 0;

        for (int i=a; i>=1; i--) {
            total += i;
        }
        return total;
    }
}