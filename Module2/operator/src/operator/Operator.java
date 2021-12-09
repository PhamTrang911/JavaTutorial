/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();

        System.out.println("----------------Arithmetic Operator--------------");
        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a * b: " + (a * b));
        System.out.println("a % b: " + (a % b));
        System.out.println("a / b: " + (a / b));

        System.out.println("----------------Relational Operator--------------");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("----------------Logic Operator-------------------");
        System.out.println("a > 8 and b < 0: " + ((a > 8) && (b < 0)));
        System.out.println("a <= b and b < 12: " + ((a <= b) && (b < 12)));
        System.out.println("a > 8 or b < 0: " + ((a > 8) || (b < 0)));

        System.out.println("----------------Ternary Operator-----------------");
        String s = (a % b == 0) ? "a chia het cho b" : "a khong chia het cho b";
        System.out.println(s);
    }

}
