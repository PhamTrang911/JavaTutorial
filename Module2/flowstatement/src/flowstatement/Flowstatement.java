/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowstatement;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Flowstatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("---------------If statement---------------");
        double s = 8;
        System.out.println("My Score: " + s);
        if (s < 6) {
            System.out.println("Grade: F");
        } else if (s < 7) {
            System.out.println("Grade: D");
        } else if (s < 8) {
            System.out.println("Grade: C");
        } else if (s < 9) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: A");
        }

        System.out.println("--------------Switch Statement-------------");
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            default:
                System.out.println("Value is default");
        }

        System.out.println("--------------Loop Statement---------------");

        int sum = 0;
        System.out.print("Enter a positive number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("The sum: " + sum);

        System.out.println("-------------While Loop--------------------");
        int x = 1, e = 0;
        while (x < 10) {
            x = x * 2;
            e++;
        }
        System.out.println("2^" + e + " = " + x);

        System.out.println("-------------Jump Statement--------------------");
        for (int i = 0; i <= 5; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }
    }
}
