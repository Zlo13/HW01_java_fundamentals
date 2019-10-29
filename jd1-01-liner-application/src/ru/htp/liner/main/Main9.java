package ru.htp.liner.main;

public class Main9 {

// 10. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
// ((SinX+CosY)/(CosX-SinY))*tgXY

	public static void main(String[] args) {
		double x;
		double y;
		double result;

		x = 76;
		y = 5;

		result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);

		System.out.println(result);

	}

}
