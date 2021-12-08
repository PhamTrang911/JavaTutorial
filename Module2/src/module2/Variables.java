/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;

/**
 *
 * @author ASUS
 */
public class Variables {

    // instance variable
    public String name;
    // static variable
    public static String major = "Information Technology";

    public void sayHello() {
        // local variable
        String n = "Hello Everyone";
        System.out.println(n);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
