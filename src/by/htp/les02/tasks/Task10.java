package by.htp.les02.tasks;

public class Task10 {
	public static void main(String[]args) {
		
		double a ,b, x, y, z ,sum1,sum2; // создание переменных
		
		x = 5;  // присваивание значений к переменным
		y = 4;
		
		//if (b == 0) { System.out.println("ERROR - делить на 0 нельзя");}
		
		a = Math.sin(x)+ Math.cos(y);  //1я часть уравнения
		b = Math.cos(x)- Math.sin(y);
		
		sum1 = a/b;                    //2я часть уравнения
		sum2 = sum1 * Math.tan(x*y);
		
		System.out.println(sum2);   // Вывод итогов уравнения в консоль
	}

}
