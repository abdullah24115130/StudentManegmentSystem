
package beg.projectNO1;

/**
 *
 * @author IT PRO
 */
public class Student {
    String name;
    int id;
    String department;
    public Student(String name,int id ,String department){
        this.name=name;
        this.id=id;
        this.department=department;
    }
    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Department : "+department);
        
    }
}
