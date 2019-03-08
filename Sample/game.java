import java.util.*;
import java.awt.*;
class game
{
	
	
	public static void main(String args[]) throws InterruptedException
{	
	Thread thread=new Thread();
	int i,j,n,r=-1,score;
	int a[]=new int[25];
	int b[]=new int[25];
	Scanner ars=new Scanner(System.in);
	n=(int)(Math.random()*1111);
        while(r==-1)
	{
	score=0;
	System.out.println("learn and enter a no. when ready");
	for(i=0;i<25;i++)
	{
		n=((n+97)*(i-n))/(i+3);
		if(n<0)
		n=-n;
		while(n>1111)
		n=n/10;
		if(n>110)
		n=n-110;
		System.out.print(n+"  ");
		a[i]=n;
	}
	System.out.println();
	thread.sleep(10000);
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nenter data");
	for(i=0;i<25;i++)
	{
		b[i]=ars.nextInt();
		end:
		for(j=0;j<25;j++)
		{
		if(b[i]==a[j])
		{
			score++;
			a[j]=-1;
		break end;
		}
		}
	}
	System.out.println("your score is "+score);
	System.out.println("enter -1 to repeat");
	r=ars.nextInt();
	}
}
}