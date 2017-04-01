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
    }
}
