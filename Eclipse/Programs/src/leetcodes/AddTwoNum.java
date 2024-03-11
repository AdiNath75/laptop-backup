package leetcodes;

import java.util.ArrayList;

public class AddTwoNum {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		System.out.println(l1);
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(5);
		l2.add(6);
		l2.add(4);
		System.out.println(l2);
		addTwoNumbers(l1,l2);
	}
	public static void addTwoNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < l1.size(); i++) {
        	int a = l1.get(i);
            num1 = num1*10+a;
		}

        for(int i=0;i<l2.size();i++)
        {
            num2 = num2*10+l2.get(i);
        }
        num1 = rev(num1);
        num2 = rev(num2);
        int ans = num1 + num2;
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        for(int i=ans;i>0;i/=10)
        {
            int rem = i%10;
            l3.add(rem);
        }
        System.out.println(l3);   
    }
    public static int rev(int num)
    {
        int rev = 0;
        for(int i=num;i>0;i/=10)
        {
            int rem = i % 10;
            rev = rev*10+rem;
        }
        return rev;
    }
}

