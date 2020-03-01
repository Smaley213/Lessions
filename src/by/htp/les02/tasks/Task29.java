package by.htp.les02.tasks;

// Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

import static java.lang.Math.*;


public class Task29 {
	public static void main(String[] args) {
		
		System.out.println("Найти (в радианах / в градусах) все углы треугольника со сторонами а, b, с.");
		
		double a, b, c, d ,e , f, g ,x, y, z ,r1, r2, r3; //создание переменных
		
		a = 33;  // присваивание значений к переменным 
		b = 40;
		c = 65;
		
		d = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2*a * b);  // считаем
		e = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2*a * c);  
		f = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2*b * c);
		
		r1 = Math.acos(d); /// тут радианы
		r2 = Math.acos(e);
		r3 = Math.acos(f);
		
		x = (180 / Math.PI) * r1;  // тут градусы
		y = (180 / Math.PI) * r2;
		z = (180 / Math.PI) * r3;
		
		System.out.println("\n"+" Значения в радианах"+"\nУгол AB = "+r1+"\nУгол BC = "+r2+"\nУгол CD = "+r3+"\n");
		System.out.println(" Значения в градусах"+"\nУгол AB = "+x+"\nУгол BC = "+y+"\nУгол CD = "+z);
	}
	

}
