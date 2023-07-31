
public class Main{
    public static void main(String[] args)
    {
        Complex c1=new Complex(9,10);
        
        Complex c2=new Complex(10,20);

        Complex c3= c1.addCom(c2);
       c3.getCom();

        
    }
}
class Complex
{
    int real;
    int img;
    Complex(int real, int img)
    {
        this.real=real;
        this.img=img;
    }
    void getCom()
    {
        System.out.println(this.real+"+i"+img);
    }
    Complex addCom(Complex temp)
    {
         return new Complex(this.real+temp.real, img+temp.img);
    }
}