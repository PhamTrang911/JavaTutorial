/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------Array Example----------------------");
        double[] numbers = {4.5, 2.1, 9.2, -1.5, 7, 6};
        double sum = 0, average;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        average = sum / numbers.length;
        System.out.println("Average is: " + average);

        System.out.println("------------Sorted Array------------");
        String[] fruits = {"Banana", "Apple", "Cherry", "Pear", "Orange"};
        // sap xep mangr cars theo thu tu tang dan
        Arrays.sort(fruits);
        System.out.println("Fruits Array is sorted : ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

