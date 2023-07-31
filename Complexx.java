import java.util.*;
import java.lang.*;

public class Complexx
{
    
    public static void main(String[] args)
    {
        ComplexNumber c1=new ComplexNumber(10, 6);
        ComplexNumber c2=new ComplexNumber(15, 6);
        
        c1.add(c2).getComple();
      
    }
}
class ComplexNumber
{
    int real;
    int img;
    ComplexNumber(int real, int img)
    {
        this.real=real;
        this.img=img;        
    }
    void getComple()
    {
        System.out.println(real+"+i"+img);
    }
    ComplexNumber add(ComplexNumber tem)
    {
        return new ComplexNumber(real+tem.real, img+tem.img);
    }
}
