public class Wrapper 
{
    public static void main(String[] args) {
        Integer n=new Integer(10);//wrapping or Boxing.... bolte bro.....
        
        System.out.println(n);//n is referec to an object ...

        int b=n.intValue();//Unboxing or unwrapping... taking the value int for Integer.....
        Integer c=55;       //autoBoxing.... behind the scene..
        int x=c;            //Auto unboxing.. 
        System.out.println(c);
        Wrapper v1=new Wrapper();
        System.out.println(v1);
    }
  public  String toString()
    {
        return "yo";
    }
}
