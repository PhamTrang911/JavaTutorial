/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Exception {

    public static void main(String[] args) {
        System.out.println("Three");

        int value = 10 / 2;

        System.out.println("Two");

        value = 10 / 1;

        System.out.println("One");

        try {

            value = 10 / 0;

            System.out.println("Value =" + value);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

            System.out.println("Ignore...");

        }

        System.out.println("Let's start!");
    }
}
