package com.oscar.practice;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        Practice oscar = new Practice(x,y);
        int a = oscar.sum();
        System.out.print("Oscar.sum = " + a);

        Practice carlos = new Practice(5,6);
        int b = carlos.sum();
        System.out.print("Carlos.sum = " + b);

        Practice isabel = new Practice(7,8);
        int c = isabel.sum();
        System.out.print("isabel.sum = " + c);

        Practice argelia = new Practice(12,14);
        int d = argelia.sum();
        System.out.print("argelia.sum = " + d);
    }
}
