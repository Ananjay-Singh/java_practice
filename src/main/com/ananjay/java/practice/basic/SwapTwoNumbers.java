package main.com.ananjay.java.practice.basic;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int temp = 0;
        System.out.printf("Value before Swap - \nA : %d \nB : %d", a, b);
        temp = a;
        a = b;
        b = temp;
        System.out.printf("\nValue After Swap- \nA : %d \nB : %d", a, b);
    }
}
