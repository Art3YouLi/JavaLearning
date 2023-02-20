package com.art3youli.string;

public class StringDemo {
    public static void main(String[] args) {
        String greeting1 = "Hello World";
        String s = greeting1.substring(0,3);
        System.out.println(s);

        String expletive = "Expletive";
        String PG12 = "delete";
        String rst =  expletive + PG12;
        System.out.println(rst);

        System.out.println(rst.equals("Expletivedelete"));
        System.out.println(rst.equalsIgnoreCase("expletiveDElEtE"));

        String greeting2 = "Hello";
        int n = greeting2.length();
        System.out.println(n);

        int cpCount = greeting2.codePointCount(0, greeting2.length());
        System.out.println(cpCount);

        // 根据索引获取对应位置上的代码单元
        char first = greeting2.charAt(0);
        System.out.println(first);
        char last = greeting2.charAt(greeting2.length()-1);
        System.out.println(last);

        // 获取指定位置的码点
        int index = greeting2.offsetByCodePoints(0, 0);
        int cp = greeting2.codePointAt(index);
        System.out.println(cp);

        //码点和代码单元：一个码点可能由一个代码单元构成，可能由两个代码单元构成，一个代码单元相当于一个char
        String sentence1 = "\uD835\uDD46"; //𝕆 特殊字符
        int m1 = sentence1.length();  // 2
        System.out.println(m1);
        int m1cpCount = sentence1.codePointCount(0, sentence1.length());
        System.out.println(m1cpCount);  //1

        String sentence2 = "ABC"; //𝕆 特殊字符
        int m2 = sentence2.length();  // 3
        System.out.println(m2);
        int m2cpCount = sentence2.codePointCount(0, sentence2.length());
        System.out.println(m2cpCount);  //3

        //遍历数组
        String sentence3 = "aaaaaassssssssssssssss";
        int[] codePoints = sentence3.codePoints().toArray();
        System.out.println(codePoints[0]);
        System.out.println(codePoints[1]);
        System.out.println(codePoints[2]);
        System.out.println(codePoints[3]);
        System.out.println(codePoints[4]);
        System.out.println(codePoints[5]);
        System.out.println(codePoints[6]);
        System.out.println(codePoints[7]);

        String new_string = new String(codePoints, 0 , codePoints.length);
        System.out.println(new_string);
    }
}
