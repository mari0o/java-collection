package net.dahae;

import java.util.HashSet;

public class HashSetTest { // �ߺ� x, ���� x

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add(3);
		hs.add(1);
		hs.add(3);
		hs.add("java");
		hs.add("test");
		hs.add("java");
		hs.add(5);
		
		System.out.println(hs);

	}

}
