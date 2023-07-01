package object;

import java.util.ArrayList;

public class Planets {
	
	int s1no;
	String name;
	String[] surface_gases;
	int moons;
	boolean rings;
	
	
	public Planets(int s1no, String name, String[] surface_gases, int moons, boolean rings) {
		super();
		this.s1no = s1no;
		this.name = name;
		this.surface_gases = surface_gases;
		this.moons = moons;
		this.rings = rings;
	}
	
	public static  ArrayList<Integer> numberOfMoon(ArrayList<Planets> a){
		ArrayList<Integer> count = new ArrayList<>();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).moons>0) {
				count.add(a.get(i).moons);
			}
		}
		return count;
	}
	public static ArrayList<String> gases(ArrayList<String> a)
	{
		int freq[] = new int[a.size()];
		for(int i=0;i<a.size();i++) {
			String gas =a.get(i);
			int count = 0;
			for(int j=i+1;j<a.size();j++) {
				String g1 = a.get(j);
				if(gas.equals(g1)) {
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i] != -1) {
				freq[i] = count;
			}
		}
		int max = freq[0];
		ArrayList<String> maxg = new ArrayList<>();
		for(int i=0;i<freq.length;i++) {
			if(max<=freq[i]) {
				max=freq[i];
				
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(max == freq[i]) {
				maxg.add(a.get(i));
			}
		}
		return maxg;
	}
}
