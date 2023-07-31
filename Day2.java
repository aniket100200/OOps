import java.util.*;
public class Day2
 {
    public static void main(String[] args) 
    {
        // Person p1=new Person("Aniket",23);  
        // p1.SetAge(23);  
        // p1.SetName("Pranli");
        // System.out.println(p1.getAge());
        // Person p2=new Person("23");
        // p2.getName();
        // Person p3=new  Person();//method overloading 
        // p3.run("Running but slowly");
        // Person p4=new Person();
        // System.out.println(p1);
        Person p1=new Person();
        p1.Set();
        p1.print();

        /*Pure OOp languages*/
        //everthing must objects and not premitives data types....
        
    }
}
class Person
{
    String lastName;
    private String name;//defalut value of /*null */
private int age;     //default value is 0;---> non static value;
Person(){System.out.println("Inside the no argument");};
   Person(String naem,int age)
   {
    this();//for contructor chaining 
    
    this.name=naem;
    this.age=age;

   }
   void print()
   {
    System.out.println(name+" "+age);
   }
   Person(String name, int age, String lastName)
   {
    this(name,age);//this is constructor chaining..
    this.lastName=lastName;
   }
   /*Important Rules */
   // 
   Person(String lastName)
   {
    
    this.lastName=lastName;
   }
   void Set()
   {
    Scanner sc=new Scanner(System.in);
    this.name=sc.nextLine();
    this.age=sc.nextInt();
   }
}
