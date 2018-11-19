package com.company;

public class Calculations {
    public int cal(int a, int b, char c) {
        switch (c) {
            case '*':
                return a * b;
            case '+':
                return a + b;
            case ',':
            case '.':
            default:
                System.out.println("No answer");
                return 0;
            case '-':
                return a - b;
            case '/':
                if (b == 0) {
                    System.out.println("You cant division on 0");
                    return 0;
                } else {
                    return a / b;
                }
        }
    }

    public void fib(int n) {
        int a = 1;
        int b = 1;

        for (int i = 0; i < n; ++i) {
            int f = a + b;
            a = b;
            b = f;
            System.out.print(f);
        }

    }

    public void fuc(int g) {
        int t = 1;

        for (int j = 1; j <= g; ++j) {
            t *= j;
        }

        System.out.println(t);
    }
}
