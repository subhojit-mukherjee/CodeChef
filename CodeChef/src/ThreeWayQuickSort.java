import java.util.Arrays;
import java.util.Scanner;


public class ThreeWayQuickSort {

	public static void quickSort(int a[],int lo,int hi)
	{
		if(hi<=lo) return;
		int lt=lo,gt=hi;
		int v=a[lo];
		int i=lo;
		while(i<=gt)
		{
			if(a[i]<v)
			{
				swap(a,lt,i);
				lt++;
				i++;
			}
			else if(a[i]>v)
			{
				swap(a,i,gt);
				gt--;
			}
			else
			{
				i++;
			}
		}
		System.out.println("\n");
		for(int ii=0;ii<a.length;ii++)
			System.out.print(a[ii]+" ");
		quickSort(a,lo,lt-1);
		quickSort(a,gt+1,hi);
	}
	
	
	public static void swap(int a[],int pos1,int pos2)
	{
		//System.out.println("pos1:"+pos1+" pos2:"+pos2);
		int temp=a[pos1];
		a[pos1]=a[pos2];
		a[pos2]=temp;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//StdRandom.shuffle(arr);
		System.out.println("After Shuffle"+"\n");
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		Arrays.sort(arr);
		
		System.out.println("**************************");
		quickSort(arr, 0, n-1);
		System.out.println("After Sort:"+"\n");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		

	}

}
