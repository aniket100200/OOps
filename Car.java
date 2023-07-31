public class Car
{
    //Attributes or data members
    String Modal_name;
    String color;
    int price;
    void Lock()
    {
        System.out.println("car is lock");
    }
    void Unlock()
    {
        System.out.println("car is unlock");
    }
    void drive()
    {
        System.out.println("car is driving");
    }
 String getPrice(){
        return "The price of the objcet is"+price;
    }
    void setPrice(int newPrice)
    {
        if(newPrice<0)return;
        price=newPrice;
    }

    Car(int price, String modalName, String color)
    {
        this.price=price;
        this.Modal_name=modalName;
        this.color=color;
        System.out.println("Constructor is running");
    }
    Car(){}//this is called constructor overloading bro...

    public static void main(String[] args)
    {
       Car a1=new Car();
    //    a1. Lock();
    //    System.out.println(a1.Modal_name);
    //    System.out.println(a1.color);
    //    System.out.println(a1.price);
    //    a1.Modal_name="Hundai";
    //    a1.color="Blue";
    //    a1.price=393;
    //    System.out.println(a1.Modal_name);
    //    System.out.println(a1.color);
    //    System.out.println(a1.price);
    //    a1.Lock();
    //    Car wagnar=new Car();
    //     wagnar.Modal_name="Wagnar";
    //     wagnar.color="White";
    //     wagnar.price=10;
    //     System.out.println(wagnar.Modal_name);
    //     System.out.println(wagnar.color);
    //     System.out.println(wagnar.price);
        a1.setPrice(100);
        System.out.println(a1.getPrice());
     Car c1=new Car(600,"Aniket","magenta");
     System.out.println(c1.getPrice());
     System.out.println(a1.getPrice());
     c1.price=-100;
     System.out.println(c1.getPrice());



    }
}
