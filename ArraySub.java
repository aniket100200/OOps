// Java program to sum two numbers
// represented two arrays.
import java.util.*;
import java.math.BigInteger;
import java.lang.*;

public class ArraySub {

//   static int[] subtract(int[] n1, int[] n2) {  
//       String s=Arrays.toString(n1);
//       String s2=Arrays.toString(n2);

//     String result=SubTract(s, s2);

      
//     // your code here
//     return(new int[0]);
//   }
//   static String SubTract(String s1, String s2) {

//    BigInteger b1=new BigInteger(s1);

//    BigInteger b2=new BigInteger(s2);

//    BigInteger result=b1.subtract(b2);
   
//   System.out.println(result);

//    return("");




//   }

  /* Driver program to test above function */
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n1 = sc.nextInt();
    // int[] arr1 = new int[n1];
    // for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    // int n2 = sc.nextInt();
    // int[] arr2 = new int[n2];
    // for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    // sc.close();

    // int[] res = subtract(arr1, arr2);
    // for (int i : res) System.out.println(i);
    int[] a={1,2,3,4,5,6};
    int[] b={1,0,5,4,9,5,4};
    // String s1=Arrays.toString(a);
    //     String s2=Arrays.toString(b);
    String s="10202039";
    String s1="294940";


    BigInteger b1=new BigInteger(s+s1);

    BigInteger b2=new BigInteger(s1);

    BigInteger result=b1.subtract(b2);
    System.out.print(result);
  }
}