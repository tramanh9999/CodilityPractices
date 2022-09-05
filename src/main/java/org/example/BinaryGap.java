package org.example;

public class Main {
    // you can also use imports, for example:
// import java.util.*;

    // you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
    int m = 0;
    int tm = 0;
    boolean isCount = false ;

    public  int solution(int N) {
        // write your code in Java SE 11
        if (N == 0) {
            return m;
        }
        int du = N % 2;
        int th = N / 2;
        if (du == 1) {
            if (tm > m) {
                m = tm;
            }
            isCount = true;
            tm = 0;
        } else if(du ==0 && isCount){
            tm++;
        }
        System.out.print(du);
        if (N == 1)
            return m;
        return solution(th);
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.solution(561892));
    }

}