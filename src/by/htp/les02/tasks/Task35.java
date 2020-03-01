package by.htp.les02.tasks;

import java.util.Scanner;

//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.

public class Task35 {
	public static void main(String[] args) {
		
		System.out.println("Введите 2 натуральных числа ,ниже! ");
		
		 Scanner s = new Scanner(System.in);
		 
		int a, b, r, m ,n ,y , x ; // Создание переменных
		
	    a = s.nextInt();  //сканируем что написали	
	    b = s.nextInt();
	    
		
		m = a;   // приравниваю для удобности визуальной
		n = b;
		
		r = m/n;
		
		System.out.println("M / N равно " + r);
		
		y = (int)r;
		
		y = y % 10;
		
		System.out.println("Младшая цифра целой части " + y);
		
		x = (int)(r * 10);
		
		x = x % 10;
		
		System.out.println("Старшая цифра дробной части " + x);	

		
	}
}
	