package assesment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestCl {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		String s = br.readLine().trim();
		solve(s);
		wr.close();
		wr.close();
	}
	static void solve(String S) {
		for(String part : S.split(" ")) {
			System.out.print(new StringBuilder(part).reverse().toString());
			System.out.print(" ");
		}
	}

}
