package ru.atom;

import java.util.ArrayList;

public class HelloWorld {

    public String getAa() {
        return aa;
    }

    public String getBb() {
        return bb;
    }

    private static String aa, bb;
    private static StringBuilder sb1, sb2;

    public static void main(String[] args) {
        System.out.println(getHelloWorld());
        ArrayList<Integer> aa = new ArrayList<Integer>();
        ArrayList<Integer> bb = new ArrayList<Integer>();
        aa.add(1); aa.add(2); aa.add(3);
        bb.add(6); bb.add(6); bb.add(6);
        sb1 = new StringBuilder("hello");
        sb2 = new StringBuilder("bye");
        sb2 = sb1;
        System.out.println(sb1);
        System.out.println(sb2);

    }

    public static void change (ArrayList<Integer> aa, ArrayList<Integer> bb) {
        aa = bb;
//        System.out.println(aa == bb);
    }

    public static String getHelloWorld() {
        return "Hello, World!";
    }

}
