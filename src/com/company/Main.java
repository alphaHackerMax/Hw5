package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int numDec = 347;
        Stack st = new Stack();
        String str="";

        for (int i = numDec; i >= 1 ; i=i/2) {
            int a = i % 2;
            st.push(a);
            str = a + str;
        }
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(str);

        int[] z = new int[st.size()];
        //int n = 0;

        for (int n = 0; n < st.size(); n++) {
        //for (Integer element: st) {
            z[n] = (int) st.pop();
            //z[n] = element;
            System.out.println(z[n]);
            //n += 1;
            //System.out.println(element);
        }
        System.out.println(z);

    }
}
