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
    }
}
