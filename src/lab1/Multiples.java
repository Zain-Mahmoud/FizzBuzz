package lab1;

public class Multiples {
    public static void main(int n, int a, int b) {

        int count = multiples(n, a, b);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i=1; i<n; i++){
            boolean isDivisiblea = i%a==0;
            boolean isDivisibleb = i%b==0;

            if (isDivisiblea || isDivisibleb){
                count++;
            }
        }
        return count;
    }
    public static int multiples() {
        int count = 0;
        for (int i=1; i<1000; i++){
            boolean isDivisiblea = i%3==0;
            boolean isDivisibleb = i%5==0;

            if (isDivisiblea || isDivisibleb){
                count++;
            }
        }
        return count;
    }
}
