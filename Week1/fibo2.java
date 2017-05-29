import java.math.*;
import java.util.*;

public class fibo2{
		public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BigInteger m=sc.nextBigInteger();
		BigInteger n=sc.nextBigInteger();
		BigInteger s=BigInteger.valueOf(0);
		BigInteger l=BigInteger.valueOf(10);
		BigInteger a=BigInteger.valueOf(0);
		BigInteger b=BigInteger.valueOf(1);
		BigInteger c=BigInteger.valueOf(0);
		BigInteger x=BigInteger.valueOf(1);
		BigInteger y=BigInteger.valueOf(2);
		BigInteger z=BigInteger.valueOf(300);
		m=m.mod(z);
		n=n.mod(z);
		if(m.equals(s)&&n.equals(s))
			{System.out.println("0");}

		else if((m.equals(s)&&n.equals(x))||m.equals(x)&&n.equals(x))
				System.out.println("1");
			
		
		else
		{
			if(m.equals(s)||m.equals(x))
				{
					m=y;
					s=x;
			}
			
				
			for (BigInteger i = BigInteger.valueOf(2);
                i.compareTo(m) <0;
                i = i.add(BigInteger.ONE)) {
				c=a.add(b);
				a=b;
				b=c;
	
			}
			//System.out.println(a+" "+b+" "+c);
			for (BigInteger i=m;
                i.compareTo(n) <= 0;
                i = i.add(BigInteger.ONE)) {
			
				c=((a.mod(l)).add(b.mod(l))).mod(l);
				//System.out.println(c);
				s=(s.add(c)).mod(l);
				//System.out.println(s);
				
				a=b;
				b=c;
			}
			System.out.println(s);
			
		}
		
		}
	}