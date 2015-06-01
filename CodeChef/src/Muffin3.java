import java.util.Scanner;


public class Muffin3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		
		if(test_case>=1 && test_case<=1000)
		{
			int result[]=new int[test_case];
			for(int i=0;i<test_case;i++)
			{
			
			int muff=sc.nextInt();
			if(muff==2)
			result[i]=2;
			else
				result[i]=(muff/2)+1;
			}
			for(int i=0;i<test_case;i++)
			{
			  System.out.println(result[i]);	
			}
		}
		

	}

}
