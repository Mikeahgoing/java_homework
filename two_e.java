package Homework_java;

public class two_e {
    public static void main(String[] args) {
        long sum1 = 1, sum2 = 1, sum3 = 1, j = 1, k = 1;
        for (long i = 1; i <= 20; i++) {
            sum1 = sum1 * i;
        }
        System.out.println("for_sum:" + sum1);
        do {
            sum2 = sum2 * j;
            j++;
        } while (j <= 20);
        System.out.println("do_while_sum:" + sum2);
        while (k <= 20) {
            sum3 = sum3 * k;
            k++;
        }
        System.out.println("while_sum:" + sum3);
    }
}
