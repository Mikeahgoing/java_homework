package Homework_java;

public class two_d {
    public static void main(String[] args) {
        double sum1 = 0, sum2 = 0, sum3 = 0, m, j = 1, k = 1;
        for (double i = 1; i <= 15; i++) {
            m = 1 / i;
            sum1 = sum1 + m;
        }
        System.out.println("for_sum:" + sum1);
        do {
            m = 1 / j;
            sum2 = sum2 + m;
            j++;
        } while (j <= 15);
        System.out.println("do_while_sum:" + sum2);
        while (k <= 15) {
            m = 1 / k;
            sum3 = sum3 + m;
            k++;
        }
        System.out.println("while_sum:" + sum3);
    }
}
