import java.util.Scanner;

class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        sc.close();
        
        int na = A.length();
        int nb = B.length();
        int cmp = A.compareTo(B);
        String cA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String cB = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        System.out.println(na + nb);
        
        if(cmp > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        System.out.println(cA + " " + cB);
    }
}
