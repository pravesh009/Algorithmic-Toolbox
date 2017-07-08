import java.util.*;
import java.io.*;

class Knapsack 
{
	public static int max(int a,int b){
		if(a>b)
			return a;
		else
			return b;
	}

    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int W=sc.nextInt();
		int n=sc.nextInt();
		int w[]=new int[n+1];
		w[0]=0;
		for(int i=1;i<=n;i++){
			w[i]=sc.nextInt();
		}
		int v[][]=new int[n+1][W+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=W;j++){
				if(j<w[i])
					v[i][j]=v[i-1][j];
				else
					v[i][j]=max((w[i]+v[i-1][j-w[i]]),v[i-1][j]);
			}
		}
		System.out.println(v[n][W]);
	}
}
