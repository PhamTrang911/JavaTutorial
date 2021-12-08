package module3;

/**
 * @overview Human is a person that have many characteristic and action
 * @attribute id Integer name String address String
 *
 */
public class Human {

    private String name;
    private int age;
    private String address;

 /** Constructor Method
 * 
 * @effects if all attributes are valid initialize this as
 * Human:<name, age, address>
 */
    public Human(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
// -------Getter and Setter Methods----------------
    /**
     * @return the firstName
     */
    public String getName() {
        return name;
    }
    /**
     *  the name to set
     */
    public void setName(String name) {
        this.name = name;

    }
    /**
     * @return the firstName
     */
    public int getAge() {
        return age;
    }
    /**
     *  the age to set
     */
    public void setAge(int age) {
        this.age = age;

    }
    /**
     * @return the firstName
     */
    public String getAddress() {
        return address;
    }
    /**
     *  the address to set
     */
    public void setAddress(String address) {
        this.address = address;

    }
    /**
    * @effects return attributes of this and respectively their values, which written by a String
    * 
    */
    @Override
    public String toString() {
        return "Human (" + name + ", " + age + ", " + address + " )";
    }
}
