package ru.htp.cycles.main;

public class Main13 {
	
// 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n. 

	public static void main(String[] args) {
		
		double y = 0, x = 1, z =0;
		
		for (int n=1; n<=3; n++) {
			
			y = 1*n;
			x = 1 / y;
			z += x;
			System.out.println(x);
			
		}
		
		System.out.println("----------------");
		System.out.println(z);
		
	}

}
