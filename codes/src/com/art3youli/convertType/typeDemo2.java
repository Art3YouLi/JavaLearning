package com.art3youli.convertType;

public class typeDemo2 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        double c = 30.0;

        double d = a + b + c;
        System.out.println(d);

        int e = -128;
        byte f = 10;
        f = (byte)e;
        System.out.println(f);

        byte g = 10;
        byte h = 20;
        // 如下会报错：
        // byte i = g + h;
        int i = g + h;
        System.out.println(i);

        int j = 1;
        char k = 'a';
        int l = j + k;
        System.out.println(l);
    }
}
