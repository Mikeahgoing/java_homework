package Homework_java;

public class two_b {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int j = 5, k = 5;
        for (int i = 5; i <= 50; i = i + 5) {
            sum1 = sum1 + i;
        }
        System.out.println("for_sum:" + sum1);
        do {
            sum2 = sum2 + j;
            j=j+5;
        } while (j <= 50);
        System.out.println("do_while_sum:" + sum2);
        while (k <= 50) {
            sum3 = sum3 + k;
            k = k + 5;
        }
        System.out.println("while_sum:" + sum3);
    }
}
