package by.htp.les02.tasks;

//Составить программу перевода радианной меры угла в градусы, минуты и секунды.

import static java.lang.Math.PI;

public class Task28 {
	public static void main(String[] args) {
		
		double  r, g ,m ,s; // зоздание переменных
		
		r = 2;   // присваивание переменной радиан
		
		g = r * (180/PI);   // решение
		m = g * 60;
		s = g * 3600;
		
		System.out.println("Радиан = "+r+"\nГрадусы = "+g+"\nМинуты = "+m+" "+ "\nСекунды = "+s);  // вывод в консоль
	}

}
