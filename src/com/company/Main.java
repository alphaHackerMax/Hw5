package com.company;

import java.util.Stack;

public class Main {

    public static String binaryConversion(int numDec){
        Stack stack = new Stack();
        String strBinary = "";

        for (int i = numDec; i >= 1; i = i / 2) {
            int stageValue = i % 2;
            stack.push(stageValue);
            strBinary = stageValue + strBinary;
        }

        int m = stack.size();
        int[] resultArray = new int[m];

        for (int n = 0; n < m; n++) {
            resultArray[n] = (int) stack.pop();
        }

        return strBinary;
    }

    public static void main(String[] args) {
        int dec = 347;

        String a = binaryConversion(347);
        System.out.println(a);
    }
}
