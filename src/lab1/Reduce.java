package lab1;

public class Reduce {
    public static void main(int n) {
        int steps = reduce(n);
        System.out.println(steps);
    }

    public static int reduce(int n) {
        int steps = 0;
        while (n >0){
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            steps++;
        }
        return steps;
    }
}
