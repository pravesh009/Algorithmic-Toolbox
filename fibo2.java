import java.math.*;
import java.util.*;

public class fibo2{
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long s=0,l=10;
		long a=0,b=1,c=0;
		long d=n%300;
		if(n==0)
				System.out.println("0");
			
		else if(n==1)
				System.out.println("1");
		else
		{
			for(int i=2;i<=d;i++)
			{
				c=((a%l)+(b%l))%l;
				s=(s+c)%l;
				a=b;
				b=c;
			}
			System.out.print((s+1)%l);
		}
		
		}
	}