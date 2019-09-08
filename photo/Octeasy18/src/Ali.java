import java.util.Scanner;

public class Ali {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String a[]=s.split("-");
		String first=a[0];
		String second=a[1];
		int sp=Integer.parseInt(second);
		String cbefore=first.substring(0, 2);
		String cAfter=first.substring(3,first.length());
		char c=first.charAt(2);
		boolean flag=true;
		if(c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U'&&c!='Y')
		{
			int s1=0;
			while(sp>0)
			{
				s1+=sp%10;
				sp=sp/10;
			}
			if(s1%2==0)
			{
				int cbefore1=Integer.parseInt(cbefore);
				int s2=0;
				while(cbefore1>0)
				{
					s2+=cbefore1%10;
					cbefore1=cbefore1/10;
				}
				if(s2%2==0)
				{
					int cAfter1=Integer.parseInt(cAfter);
					int asd[]=new int[3];
					int i=0;
					while(cAfter1>0)
					{
						asd[i++]=cAfter1%10;
						cAfter1=cAfter1/10;
					}
					if(((asd[0]+asd[1])%2==0 )&&(asd[1]+asd[2])%2==0)
					{
						
					}
					else
					{
						flag=false;
					}
				}
				else
				{
					flag=false;
				}
			}
			else
			{
				flag=false;
			}
		}
		else
		{
			flag=false;
		}
		if(flag)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		
	}

}
