package object;

import java.util.Scanner;
import java.util.ArrayList;

public class PlanetDriver {
	
	public static void main(String[] args) {
		
		ArrayList<Planets> a = new ArrayList<>();
		ArrayList<String> gas = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=1;i<=6;i++) {
				int s1no =i;
				System.out.println("Enter the name of planet");
				String name = sc.next();
				System.out.println("Enter the number of gases");
				int size = sc.nextInt();
				String[] gases = new String[size];
				System.out.println("Enter name of gases");
				sc.nextLine();
				for(int j=0;j<gases.length;j++) {
					gases[j] = sc.nextLine();
					gas.add(gases[j]);
				}
				System.out.println("Enter the number of moons");
				int num = sc.nextInt();
				System.out.println("Enter about rings");
				boolean ans = sc.nextBoolean();
				a.add(new Planets(s1no, name, gases, num, ans));
			}
			System.out.println("Select a choice");
			System.out.println("1. Find count of moon");
			System.out.println("2.Find the gases");
			int choice =sc.nextInt();
			switch(choice){
				case 1:
				{
					System.out.println(Planets.numberOfMoon(a));
					break;
				}
				case 2:
				{
					System.out.println(Planets.gases(gas));
					break;
				}
			}
		}
	}
}
