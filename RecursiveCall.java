package com.sangjun.Object_oriented_Programming1;

public class RecursiveCall {
    public static void main(String[] args){
        int result1 = recursiveCall1(4);
        System.out.println("4*3*2*1: "+ result1);

        int n = 21;
        long result2 =0;

        System.out.println(" n power calculate");

        for(int i = 1; i <= n; i++){
            result2 = recursiveCall2(i);
            if (result2 == -1){
                System.out.printf("invaild number. (0 < n <= 20): %d%n", n);
                break;
            }
            System.out.printf("%2d!=%20d%n",i, result2);
        }
    }

    static int recursiveCall1(int n) {
        if(n == 1) return 1;
        return n * recursiveCall1(n-1);
    }

    static long recursiveCall2(int n){
        if(n <= 0 || n > 20) return -1;
        if (n == 1) return 1;
        return n * recursiveCall2(n -1);
    }
}
