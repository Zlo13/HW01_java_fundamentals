package ru.htp.liner.main;

public class Main5 {

// 6. Написать код для решения задачи. В n малых бидонах 80 л 
//	  молока. Сколько литров молока в m больших бидонах, если в 
//	  каждом большом бидоне на 12 л. больше, чем в малом? 

	public static void main(String[] args) {
		int n; // малые бидоны шт.
		int m; // большие бидоны шт.
		n = 8;
		m = 2;
		int minCanister;
		int maxCanisters;
		minCanister = 80 / n;
		maxCanisters = (minCanister + 12) * m;
		System.out.println("Всего в 2-х больших бидонах " + maxCanisters + " литра молока.");

	}

}
