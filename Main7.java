package 算法题;

import java.util.Scanner;
//1 1 2 3 5 8 13 21 34
public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 1;
        int b = 1;
        while (true){
            int c = a+b;
            if (c==N || N==b || N==a) System.out.println(0);
            if (N>b && N<c){
                System.out.println(Math.min(N-b,c-N));

            }
            a=b;
            b=c;
        }
    }
}
