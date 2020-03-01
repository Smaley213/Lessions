package by.htp.les02.tasks;

import java.util.Scanner;

// Дана величина А, выражающая объем информации в байтах. 
// Перевести А в более крупные единицы измерения информации.

public class Task34 {
	public static void main(String[] args) {
		
		System.out.println("Введите значение А в байтах, ниже "+"\nМаксимум 9 символов");
		
		 Scanner s = new Scanner(System.in);
		 
		int  k, m  ,h ; // Создание переменных
		
		h = s.nextInt();  //сканируем что написали
	
		k = h / 1024;         // просчитываем 
		m = k / 1024;
		double g = m / 1024;
		double t = g / 1024;
		
		System.out.println("\nA = "+h+"\nКилобайт = "+k+"\nМегабайт = "+m+"\nГигабайт = "+g+"\nТерабайт = "+t); // вывод в консоль
		
		
	}

}
