package Homework_java;

public class nineteen {
    public static void main(String[] args) {
        int i;
        System.out.println("                     "+"LENGTH");
        for (i = 5; i <= 25; i = i + 5){
        if (i==5){
            System.out.print("             "+i);
        }
        else System.out.print("    "+i);
        }
        System.out.println();
            for (int j = 11; j <= 20; j++) {
                if (j==15){
                    System.out.print("WIDTH"+"  "+j+"  ");
                }
                else  System.out.print("       "+j+"  ");
            for (i = 5; i <= 25; i = i + 5) {
                System.out.print(" "+i * j * 19 + " ");
            }
            System.out.println();
        }
    }
}
