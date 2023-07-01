package assesment;
import java.util.*;

public class LYTI {
	// Java program for above approach
	
		
		// Driver Code
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			Integer[] arr = new Integer[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] = in.nextInt();
			}
			List<Integer> list = Arrays.asList(arr);
			sorFre(list,arr);
		}
		public static void
		sorFre(List<Integer> list, Integer[] arr)
		{
			int n = arr.length;
			final HashMap<Integer, Integer> mapCount
				= new HashMap<Integer, Integer>();
			final HashMap<Integer, Integer> mapIndex
				= new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				if (mapCount.containsKey(arr[i])) {
					mapCount.put(arr[i],
								mapCount.get(arr[i]) + 1);
				}
				else {
					mapCount.put(
						arr[i],
						1); // Map to capture Count of elements
					mapIndex.put(arr[i],
								i); // Map to capture 1st
									// occurrence of elements
				}
			}

			Collections.sort(list, new Comparator<Integer>() {
				public int compare(Integer n1, Integer n2)
				{
					int freq1 = mapCount.get(n1);
					int freq2 = mapCount.get(n2);
					if (freq1 != freq2) {
						return freq2 - freq1;
					}
					else {
						return mapIndex.get(n1)
							- mapIndex.get(
								n2);
					}
				}
			});
			System.out.println(list);
		}


}
