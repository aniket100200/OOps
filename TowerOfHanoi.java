import java.util.*;
public class TowerOfHanoi
 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        tob(n,"A","B","C");
    }
    public static void tob(int n, String source, String helper, String dest)
    {
        if(n==1){
            System.out.println("Trafersing disk "+n+" From "+source+" to "+dest);
            return ;
        }
        tob(n-1,source,dest, helper);
        System.out.println("Trafersing disk "+n+" From "+source+" to Destination "+dest);
        tob(n-1,helper,source,dest);
    }
}
