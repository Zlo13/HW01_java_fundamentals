package ru.htp.liner.main;

public class Main26 {

//	27. Дано значение a. Не используя никаких функций и никаких 
//	операций, кроме умножения, получить значение а8 за три 
//	операции и  а10 за четыре операции. 

	public static void main(String[] args) {

		int a;
		int b;

		a = 2;

		a = a * a;
		b = a * a;
		b = b * b;

		System.out.println(b);

		b = b * a;

		System.out.println(b);

	}

}
