package assignment;

public class Launch1 {
	public static void main (String args[])
	{

	int n=9;
	for(int i=0;i<n;i++) 
	{
		for(int j=0;j<n;j++)    //c
		{
			if((j==0 && i<n-1 && i>0) || (i==0 && j>0 && j<n-1) || (i==n-1 && j>0) && j<n-1)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //H
		{
			if( i==(n-1)/2 || j==0 || j==n-1)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //A
		{
			if((i==0 && j>n/4 && j<(3*n)/4) || (j==n/4 && i>0) || (j==(3*n)/4 && i>0) || (i==(n-1)/2) && j<=(3*n/4)&& j>=(n)/4)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //N
		{
			if( i==j || j==0 || j==n-1)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		
		
		for(int j=0;j<n;j++)    //D
		{
			if((i==0 && j<n-1 && j>=n/4) || j==n/4 || (i==n-1 && j<n-1 &&j>=n/4) || (j==n-1 && i>0 && i<n-1))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //R
		{
			if((j==n/4)|| (i==0 && j<n-1 && j>=n/4) || (j==n-1 && i<(n-1)/2 && i>0) || (i==(n-1)/2) && (j>=n/2)&&(j<n-1) 
					|| (i==j && i>n/2 && j>n/2))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //A
		{
			if((i==0 && j>n/4 && j<(3*n)/4) || (j==n/4 && i>0) || (j==(3*n)/4 && i>0) || (i==(n-1)/2) && j<=(3*n/4)&& j>=(n)/4)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //K
		{
			if((j==(n-1)/2) || (i==j && j>n/2 && i>n/2 ) ||(i+j==(n-1) && (i<n/2)&& j>n/2 ))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //A
		{
			if((i==0 && j>n/4 && j<(3*n)/4) || (j==n/4 && i>0) || (j==(3*n)/4 && i>0) || (i==(n-1)/2) && j<=(3*n/4)&& j>=(n)/4)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //N
		{
			if((j==0 ||j==n-1|| i==j))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //T
		{
			if((i==0 && j>0 && j<n-1) || j==(n-1)/2)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //H
		{
			if( i==(n-1)/2 && j<3*n/4|| j==0 || j==3*n/4)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //R
		{
			if((j==n/4)|| (i==0 && j<n-1 && j>=n/4) || (j==n-1 && i<(n-1)/2 && i>0) || (i==(n-1)/2) && (j>=n/2)&&(j<n-1) 
					|| (i==j && i>n/2 && j>n/2))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //E
		{
			if((j==n/4 || i==0 && j>n/4|| i==n-1 && j>n/4) || i==(n-1)/2 && j>n/4)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //D
		{
			if((i==0 && j<n-1 && j>=n/4) || j==n/4 || (i==n-1 && j<n-1 &&j>=n/4) || (j==n-1 && i>0 && i<n-1))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //D
		{
			if((i==0 && j<n-1 && j>=n/4) || j==n/4 || (i==n-1 && j<n-1 &&j>=n/4) || (j==n-1 && i>0 && i<n-1))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //Y
		{
			if((i+j==n-1)||(i==j && i<n/2 && j<n/2))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		
		
		
		System.out.println();
		
	}
	System.out.println();
	System.out.println();

	for(int i=0;i<n;i++) 
	{
		for(int j=0;j<n;j++)
		{
			if(i==0 && j<n-1 || j==(n-1)/2 || i==n-1 && j<n-1)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //N
		{
			if((j==0 ||j==n-1|| i==j))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //E
		{
			if((j==n/4 || i==0 && j>n/4|| i==n-1 && j>n/4) || i==(n-1)/2 && j>n/4)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //U
		{
			if((j==n/4 && i<n-1) || (j==n-1 && i<n-1) || (i==n-1 && j>n/4 &&  j<n-1))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //R
		{
			if((j==n/4)|| (i==0 && j<n-1 && j>=n/4) || (j==n-1 && i<(n-1)/2 && i>0) || (i==(n-1)/2) && (j>=n/2)&&(j<n-1) 
					|| (i==j && i>n/2 && j>n/2))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)    //O
		{
			if((i==0 && j>n/4 && j<3*n/4) || (j==n/4 && i>0 && i<n-1)
					||(j==3*n/4 && i>0 && i<n-1) || (i==n-1) && (j>n/4) && j<3*n/4)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		for(int j=0;j<n;j++)   //N
		{
			if((j==0 ||j==n-1|| i==j))
			System.out.print("*");
			else
			System.out.print(" ");
		}
		
		System.out.println();
	}
}
}
