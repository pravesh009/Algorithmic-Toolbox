import java.math.*;
import java.util.*;

public class Nmodm{
	
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			long n=sc.nextLong();
			long m=sc.nextLong();
			long period=0,a=0,b=1,c=0;
			long[] s=new long[(int)(6*m)];
			for (long i = 1;i<m*m;i++) {
				c=(a+b)%m;
				a=b;
				b=c;
				if(a==0&&b==1)
				{
					period=i;
					break;
					}
			}
			n=n%period;
			s[0]=0;
			s[1]=1;
			for (long i = 2;i<=n;i++) {
				c=((a%m)+(b%m))%m;
				s[(int)i]=c;
				a=b;
				b=c;
			}
			System.out.println(s[(int)n]);
			
		}
	}