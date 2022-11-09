package Homework_java;

public class two_c {
    public static void main(String[] args) {
        double a = 2;
        double c;
        double sum1 = 0, sum2 = 0, sum3 = 0;
        int j = 1, k = 1;
        for (int i = 1; i <= 20; i++) {
            c = Math.pow(a, i) - 1;
            sum1 = sum1 + c;
        }
        System.out.println("for_sum:" + sum1);
        do {
            c = Math.pow(a, j) - 1;
            sum2 = sum2 + c;
            j++;
        } while (j <= 20);
        System.out.println("do_while_sum:" + sum2);
        while (k <= 20) {
            c = Math.pow(a, k) - 1;
            sum3 = sum3 + c;
            k++;
        }
        System.out.println("while_sum:" + sum3);
    }
}
