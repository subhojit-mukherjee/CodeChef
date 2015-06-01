import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class CandidateCode {

	public static String getPosition(int[] input1) {
		String result = "";
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < input1.length; i++) {
			if((input1[i]<0)||(input1[i]>20))
				return "invalid";
			if (map.get(input1[i]) != null) {

				int maxCommon = 0;
				for (Integer j : map.get(input1[i])) {
					int l = j;
					int nowMax = 0;
					for (int k = i; k > j && l >= 0; k--, l--) {
						if (input1[k] == input1[l])
							nowMax++;
						else
							break;
					}
					if (nowMax > maxCommon)
						maxCommon = nowMax;
				}
				if (i == (input1.length - 1))
					result += maxCommon;
				else
					result += maxCommon + ",";
				ArrayList<Integer> list = (ArrayList<Integer>) map
						.get(input1[i]);
				list.add(i);
				map.put(input1[i], list);
			} else {

				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(input1[i], list);
				if (i == (input1.length - 1))
					result += "0";
				else
					result += "0,";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter no. of items:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			// System.out.println(i);
			a[i] = sc.nextInt();
		}
		
		
		System.out.println(getPosition(a));

	}

}
