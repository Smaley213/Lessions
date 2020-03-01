package by.htp.les02.tasks;
//Вычислить значение выражения по формуле 

public class Task9 {
	public static void main(String[]args) {
		
		int a ,b, c, d, Sum ,Sum1; // присваивание переменных
		
		a = 20;   // присваивание значений к переменным
		b = 34;
		c = 2;
		d = 1;
		
		Sum1= (a/c) * (b/d);  // 1я часть формулы
		
		Sum = Sum1 - (a*b - c) / c*d;  //2я часть формулы
		
		System.out.println(Sum);  // Вывод итогов в консоль
		
	}

}
