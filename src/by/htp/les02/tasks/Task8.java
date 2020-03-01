package by.htp.les02.tasks;
// Вычислить значение выражения по формуле 

public class Task8 {
	public static void main(String[]args) {

		double a, b, c ,sum ,sum1 ,sum2 ; //присваивание переменной

        
		a = 5; //присваивание значения переменной
		b = 6;
		c = 0;
		
		// if (s == 0) { System.out.println("ERROR - делить на 0 нельзя");}
			
		


		sum1 =  b + Math.sqrt(b * b + 4 * a * c);  // 1я часть уравнения
		sum2 = (2 * a);   // 2я часть уравнения
		sum = sum1 / sum2;
		sum = Math.pow(a, 3) * c + Math.pow(b, -2);          //3 я часть 

		System.out.println("Итого = " + sum);   //вывод итогов в консоль
		
	}

}
