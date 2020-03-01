package by.htp.les02.tasks;
//Найдите значение функции: z = ((a-3) * b/2) + c

public class Task4 {
	public static void main(String[]args) {
		
int a, b, c, x, y, z; // обьявление переменных
		
		a = 12;                // присвоение значений к переменным
		b = 5;
		c = 6;
		x = 3;
		y = 4;
		
		z = ((a-3) * b/2) + c; // обьявляем переменную 'z' и находим её значение
		
		System.out.println("Значение= "+ z); //вывод результата в консоль
	}

}
