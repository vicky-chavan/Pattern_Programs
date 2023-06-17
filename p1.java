package Patterns;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//2
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//3
		
		for(int i=1;i<=5;i++)
		{
			int a=5;
			int b=2;
			for(int j=1;j<=5;j++)
			{
				if(i%2==0)
				{
					System.out.print(a+" ");
					a=a+5;
				}
				else
				{
					System.out.print(b+" ");
					b=b+2;
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//4
		
		char c='a';
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
				System.out.print(c +" ");
				
			}
			c++;
			System.out.println();
		}
		
		System.out.println("--------------");
		//5
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0))
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//6
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j%2!=0)
				{
					System.out.print("* ");
				}
				else
					System.out.print("+ ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//7
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//8
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//9
		
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num++%2+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//10
		
		int num1=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num1++%6+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//11
		
		int num2=1;
		for(int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(num2++ +" ");
				}
				num2=(num2+i)+1;
				System.err.println();
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(--num2+" ");
				}
				num2=num2+i;
				System.out.println();
			}
		}
		
		System.out.println("--------------");
		//12
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//13
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//14
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>j)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------");

		//15
		
		int aa=2;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(aa++%2+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//16
		
		
		for(int i=1;i<=6;i++)
		{
			int num3=1;
			for(int j=1;j<=6;j++)
			{
				if(i==1||j==1||i==6||j==6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(num3+++" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//17
		
		
		int num4=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(num4++ +" ");
				if(num4==6)
				{
					num4=1;
				}
			
			}
			num4=num4+1;
			System.out.println();
		}
		
		System.out.println("--------------");
		//18
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(i==5||j==5)
				{
					System.out.print("* ");
				}	
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		//19
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j || i+j==6)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(); 
			
		}
		
		System.out.println("--------------");
		//20
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		//21
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		//22
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		//23
		
		int a5=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a5);
			}
			a5--;
			System.out.println();
		}
		
		System.out.println("------------------");
		//24
		
		int a6=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
				
			{
				System.out.print(a6);
			}
			a6--;
			System.out.println();
		}
		
		System.out.println("------------------");
		//25
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
	}
	

}
