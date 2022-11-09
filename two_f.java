package Homework_java;

public class two_f {
    public static void main(String[] args) {
        double sum1 = 1, sum2 = 1, sum3 = 1;
        double a = 2, c;
        int j = 0, k = 0;
        for (int i = 0; i <= 20; i++) {
            c = Math.pow(a, i);
            sum1 = sum1 * c;
        }
        System.out.println("for_sum:" + sum1);
        do {
            c = Math.pow(a, j);
            sum2 = sum2 * c;
            j++;
        } while (j <= 20);
        System.out.println("do_while_sum:" + sum2);
        while (k <= 20) {
            c = Math.pow(a, k);
            sum3 = sum3 * c;
            k++;
        }
        System.out.println("while_sum:" + sum3);
    }
}
