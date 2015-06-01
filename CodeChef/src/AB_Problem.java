import java.util.Scanner;
public class AB_Problem {

	public static int num_of_digit(int n,int count)
	{
		if (n==0)
			return count;
		count++;
		return num_of_digit(n/10, count);
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int n=A-B;
		int result=num_of_digit(n, 0);
		int arr[]=new int[result];
		for(int i=result-1;i>=0;i--)
		{
			arr[i]=n%10;
			n=n/10;
		}
		
		if(result==1)
		{
			int temp=(arr[0]+1)%10;
			if(temp==0)
				temp++;
			arr[0]=temp;
		}	
		else
		{
			arr[1]=(arr[1]+1)%10;;
		}
		System.out.print("\n");
		for(int i=0;i<result;i++)
			System.out.print(arr[i]);
		
			
	}
}
