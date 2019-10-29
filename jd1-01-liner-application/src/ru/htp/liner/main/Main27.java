package ru.htp.liner.main;

import java.text.NumberFormat;

public class Main27 {

// 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.

	public static void main(String[] args) {
		
		int x;
		x = 180; 
		
		double radian;
		radian = (Math.PI * x) / 180; 
		
		double rez;
		rez = Math.sin(radian); 
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(4);
		
		System.out.println("sin(" + x + ")градусов=" + nf.format(rez));
		
		double rad;
		rad = 3.1416;
		double grad; 
		grad = (rad * 180) / Math.PI;
		int g;
		g = (int) grad;
		double min = (grad * 60) % 60;
		int m = (int) min;
		
		int sec = (int) (min * 60) % 60;
		
		System.out.println("радиан(" + rad + ")=" + g + "(градусов)" + "=" + m + "(минут)" + "=" + sec + "(секунд)");
		
		int sec1 = 1;
		int min1 = 0;
		int grad1 = 180;
		int g1 = sec1 / 60 / 60 + min1 / 60 + grad1;
		double rad1 = (g1 * Math.PI) / 180;
		
		System.out.println(grad1 + "(градусов)" + "=" + min1 + "(минут)" + "=" + sec1 + "(секунд)" + "=" + nf.format(rad1) + "(радиан)");

	}

}
