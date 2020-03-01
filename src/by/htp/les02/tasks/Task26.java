package by.htp.les02.tasks;

import java.util.Scanner;

// Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.

public class Task26 {
	public static void main(String[] args) {
		
		double  a ,b, y ,s;  //создание переменных
		
		 Scanner h = new Scanner(System.in);
			
		 System.out.println("Введите значения ниже, последовательно");
		 
		    a = h.nextInt();      // ввод значений
		    b = h.nextInt();
		    y = h.nextInt();
		
		s = a * b * Math.sin(y) / 2;  // Считаем 
		
		System.out.println("Площадь = "+s);  // Итоги на консоль
	}

}
