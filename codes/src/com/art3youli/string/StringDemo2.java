package com.art3youli.string;

import java.lang.reflect.Type;

public class StringDemo2 {
    public static void main(String[] args) {

        String sentence = "ac";
        String sentence2 = "";
        // compareTo
        // 两个字符串不一样长，且sentence2是以sentence开头，则返回两个字符串的长度差值，即sentence.length() - sentence2.length()
        sentence2 = "acb";
        System.out.println(sentence.compareTo(sentence2));  // -1

        // 两个字符串完全一样，则返回0
        sentence2 = "ac";
        System.out.println(sentence.compareTo(sentence2)); // 0

        // 两个字符串首字母不同，则返回两个字符串首字符ASCII码差值
        sentence2 = "bcc";
        System.out.println(sentence.compareTo(sentence2)); // -1

        // 两个字符串首字母相同，但其他不同，则返回第一个不同的字符的ASCII码差值
        System.out.println(sentence.compareTo("abc"));  // 1

        // equals
        sentence2 = "ac";
        System.out.println(sentence.equals(sentence2)); // true

        sentence2 = "acb";
        System.out.println(sentence.equals(sentence2)); // false

        // startsWith & endsWith
        System.out.println(sentence2.startsWith("a")); // true
        System.out.println(sentence2.startsWith("ac")); // true
        System.out.println(sentence2.startsWith("acb")); // true
        System.out.println(sentence2.startsWith("acbe")); // false

        System.out.println(sentence2.endsWith("b")); // true
        System.out.println(sentence2.endsWith("cb")); // true
        System.out.println(sentence2.endsWith("acb")); // true
        System.out.println(sentence2.endsWith("aacb")); // false

        // indexOf & lastIndexOf
        sentence2 = "Hello world, welcome to the universe.";
        System.out.println(sentence2.indexOf('H')); // 0
        System.out.println(sentence2.indexOf("He")); // 0
        System.out.println(sentence2.indexOf('l')); // 2
        System.out.println(sentence2.indexOf("el")); // 1
        System.out.println(sentence2.indexOf("ela")); // -1,找不到返回-1
        System.out.println(sentence2.indexOf('e',14)); // 14，从第fromIndex的位置找（包括fromIndex位置上的），找到第一个符合条件的后，返回其在这整个字符串的位置

        System.out.println(sentence2.lastIndexOf('.')); // 36
        System.out.println(sentence2.lastIndexOf("e.")); // 35
        System.out.println(sentence2.lastIndexOf("He")); // 0
        System.out.println(sentence2.lastIndexOf("Helslsls")); // -1,找不到返回-1
        System.out.println(sentence2.lastIndexOf('e',20)); // 19，从第fromIndex的位置从后往前找（包括fromIndex位置上的），找到第一个符合条件的后，返回其在这整个字符串的位置

        // replace
        System.out.println(sentence2.replace("el", "le")); // 不会改变原变量值
        System.out.println(sentence2);

        // subString 从指定位置截取，默认截取到最后
        System.out.println(sentence2.substring(2));
        System.out.println(sentence2.substring(2,10));
        System.out.println(sentence2);

        // 连接
        System.out.println(String.join("aaa", "--", "==", "++"));

        // 构建字符串
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        builder.append("asdasdad");
        System.out.println(builder);
        System.out.println(builder.getClass().toString());
        System.out.println(builder.toString());
        System.out.println(builder.toString().getClass().toString());
    }
}
