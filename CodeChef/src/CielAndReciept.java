import java.util.Scanner;


public class CielAndReciept {

	public static void main(String[] args) {
		int arr[]=new int[12];
		for(int i=0;i<12;i++)
		{
			arr[i]=(int) Math.pow(2.0, i);
		}
		
		int flag1=8;
		int flag2=128;
		int flag3=2048;
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		int []result=new int[test_case];
		for(int i=0;i<test_case;i++)
		{
			int element=sc.nextInt();
			if(((element%flag3)==0)&&(element>flag3))
			{
				result[i]=element/flag3;
			}
			else if(element<=flag1)
			{
				if(element==flag1)
					result[i]=1;
				else
				for(int j=0;j<3;j++)
				{
					
				}
					
			}
			
			
		}

	}

}
