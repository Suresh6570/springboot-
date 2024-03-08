package sample;

import java.util.ArrayList;
import java.util.List;

public class Details {

	
	public static void main(String[] args) {
		
		List <StdDetails> std = new ArrayList<>();
		
		StdDetails s =new StdDetails("Suresh", 21, 6364391120l, 60.5f, 154);
//		StdDetails s1 =new StdDetails("Mani", 27, 6365391120l, 75.0f, 160);
//		StdDetails s2 =new StdDetails("Bala", 23, 6378791120l, 56.0f, 150);
		std.add(s);
//		std.add(s1);
//		std.add(s2);
		
		for (StdDetails st : std) {
			System.err.println(st.getName());
			System.err.println(st.getAge());
			System.err.println(st.getPhoneNo());
			System.err.println(st.getWeight());	
			System.err.println(st.getHeight());
		}
		
	}
}
