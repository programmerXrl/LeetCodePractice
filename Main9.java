package 算法题;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num1 = a;
        int num2 = b;
        int temp = 0;
        while (num2!=0){
            temp=num1%num2;
            num1=num2;
            num2=temp;
        }
        System.out.println(a*b/num1);
    }
}
