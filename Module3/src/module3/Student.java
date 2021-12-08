/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3;

/**
 *
 * @author ASUS
 */
public class Student extends Human{
    private String major;
    private String schoolName;

    public Student(String name, int age, String address, String major, String schoolName) {
        super(name, age, address);
        this.major = major;
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

   public String toString(){
       return "Student (" + getName() + ", " + getAge() + ", " + getAddress()+ ", " + major + ", " + schoolName.toUpperCase() +" )";
    }
    
    
}
