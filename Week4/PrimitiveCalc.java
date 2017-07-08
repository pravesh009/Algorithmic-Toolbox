import java.util.*;
import java.io.*;

class PrimitiveCalc 
{
	public static int Min(int a,int b){
		if(a<b)
			return a;

		else
			return b;
	}

    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		int mem[]=new int[n+1];
		mem[1]=0;
		for(int i=2;i<=n;i++){
			mem[i]=1+mem[i-1];
			
			if(i%2==0)
				mem[i]=Min(mem[i],1+mem[i/2]);
			if(i%3==0)
				mem[i]=Min(mem[i],1+mem[i/3]);
		}
		int minCount=mem[n];

		System.out.println(minCount);
			int i = n;
		while (i>1) {
			a.add(i);
			if (mem[i-1] <minCount){
				minCount=mem[i-1];
				i = i-1;
			}
				
			else if (i%2 == 0 && (mem[i/2]  < minCount))
			{
			minCount=mem[i/2];
			i = i/2;
		}
			else if (i%3 == 0 && (mem[i/3] < minCount))
			{
		minCount=mem[i/3];
		i = i/3;
		}
		}
		a.add(1);
Collections.reverse(a);
		Iterator itr=a.iterator();  
  while(itr.hasNext()){  
   System.out.print(itr.next()+" ");  
  }  
		
	}
}