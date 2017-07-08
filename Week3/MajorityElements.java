import java.util.*;
import java.io.*;

class MajorityElements 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int j = 0, c = 1;
        
        for (int i = 1; i < n; i++) 
        {
            if (a[j] == a[i])
                c++;
            else
                c--;
            if (c == 0)
            {
                j = i;
                c = 1;
            }
        }
		int max=a[j],count=0;
		  for (int i = 0; i < n; i++) 
        {
            if (a[i] == max)
                count++;
        }
        if (count > n / 2) 
            System.out.println("1");
        else
             System.out.println("0");
    }
}
 