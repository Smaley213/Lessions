package by.htp.les02.tasks;
 
// Дано значение a. Не используя никаких функций и никаких операций, кроме умножения,
//получить значение а8 за три операции и а10 за четыре операции.


public class Task27 {
	public static void main(String[] args) {
		
		double a;
		double x;
		double y;
		double z;
		double w;
		
		a = 2;//произвольное значение

		x = a * a;
		y = x * x;
		z = y * y;// 'a' в 8 степени
		w = z * x;// 'a' в 10 степени

		System.out.println("'a' в 8 степени равно " + z + "\n'a' в 10 степени равно " + w); 
	}

}
