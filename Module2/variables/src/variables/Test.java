/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------Variables Testing-------------------");
        Variables v1 = new Variables();
        v1.setName("My name is Trang");
        v1.sayHello();
        System.out.println(v1.getName());
        System.out.println("My major is " + Variables.major);

      
        
       ;
    }

}
