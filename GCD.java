import java.math.*;
import java.util.*;

public class GCD{
	
	public int gcd(int a,int b){
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	int a=sc.nextInt();
	int b=sc.nextInt();
	GCD x=new GCD();
	System.out.print(x.gcd(a,b));
	
	}

}