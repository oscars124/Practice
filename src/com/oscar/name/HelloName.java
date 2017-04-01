package com.oscar.name;


import java.util.Scanner;

/**
 * Created by oscar.semprun on 03/27/2017.
 */
public class HelloName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);System.out.print("What is your name");
        String yourName = input.nextLine();
        /*System.out.print("Hello ");
        System.out.println(yourName);*/
        System.out.printf("Hello, %s!!!\n",yourName);
    }
}
