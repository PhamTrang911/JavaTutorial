
package module3;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human h1 = new Human ("Dung", 11, "Xuan Hong");
        System.out.println(h1.toString());
        Student s1 = new Student("Trang", 22, "Nam Dinh", "Fit", "Ha Noi University");
        System.out.println(s1.toString());
    } 
}
