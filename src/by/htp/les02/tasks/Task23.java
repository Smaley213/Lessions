package by.htp.les02.tasks;

//Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).

public class Task23 {
	public static void main(String[] args) {
		
		int R,r;   // Создание переменной
		double s;
		
		R = 10;    // Присваивание значений к переменным
		r = 4;
		
		 System.out.println("Внешний радиус = "+ R ); // вывод значения 
		 System.out.println("Внутренний радиус = "+ r ); 
		
		s=Math.PI*(R*R-r*r); // подсчет 
		
		 System.out.println("площадь = "+s); // вывод площади в консоль
	}

		
}
