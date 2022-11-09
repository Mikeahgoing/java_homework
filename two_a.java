package Homework_java;

public class two_a {
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int j = 1;
        int k = 1;
        for (int i = 1; i <= 100; i++) {
            sum1 = sum1 + i;
        }
        System.out.println("for_sum:" + sum1);
        do {
            sum2 = sum2 + j;
            j++;
        } while (j <= 100);
        System.out.println("do_while_sum:" + sum2);
        while (k <= 100) {
            sum3 = sum3 + k;
            k++;
        }
        System.out.println("while_sum:" + sum3);
    }


}
