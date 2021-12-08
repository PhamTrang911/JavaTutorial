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
public class Module2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // --------Test Variables-------
       Variables v1 = new Variables();
       v1.setName("My name is Trang");
       v1.sayHello();
       System.out.println(v1.getName());
        System.out.println("My major is " + Variables.major);
    }
    
}
