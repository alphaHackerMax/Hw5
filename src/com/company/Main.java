package com.company;

import java.util.Arrays;
import com.company.MyBinary;

public class Main {

    public static void main(String[] args) {
        int dec = 347;  // число для перевода; тестовый вариант 135(dec) => (bin)1000 0111

        String a = MyBinary.binaryConversion(dec);
        System.out.println(a);

        int[] res = MyBinary.myBinArr(dec);
        System.out.println(Arrays.toString(res));

        int[] res2arr = MyBinary.myBinArr2(dec);
        System.out.println(Arrays.toString(res2arr));

        String res2str = MyBinary.myBinString2(dec);
        System.out.println(res2str);
    }
}
