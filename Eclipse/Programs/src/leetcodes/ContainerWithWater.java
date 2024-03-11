package leetcodes;

import java.util.ArrayList;

public class ContainerWithWater {
	
	public static void main(String[] args) {
		
		int height[] = {1,8,6,2,5,4,8,3,7};
		ArrayList<Integer> a1 = new ArrayList<>();
		
		for (int i = 0; i < height.length; i++) {
            for(int j=i+1;j<height.length;j++){
                int num = height[i]<=height[j]?height[i]:height[j];
                a1.add(num*(j-i));
            }
		}
		System.out.println(a1);
		int ans = 0;
		for (int i = 0; i < a1.size(); i++) {
			
			if(ans<a1.get(i)) {
				ans=a1.get(i);
			}
		}
		System.out.println(ans);
	}
}
