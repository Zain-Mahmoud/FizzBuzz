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
}
