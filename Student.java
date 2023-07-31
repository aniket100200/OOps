public class Student
{
    public static void main(String[] args) 
    {
        accio obj1=new accio();
        obj1.SetName("Aniket");
        accio obj2=new accio();
        obj2.SetName("Arif");
    }
}

class accio
{
    String name;
    int age;
    void SetName(String name)
    {
        this.name=name;
    }
    void SetAge(int age)
    {
        this.age=age;
    }
}