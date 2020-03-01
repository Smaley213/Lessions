package by.htp.les02.tasks;
//  Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

public class Task20 {
	public static void main(String[] args) {
		
		int a ;           // создание переменных
		double r ,s ;
		
		a = 10;   // присваивание значения к переменной
		
		System.out.println("длина окружности = "+ a);
		
		 r = a / 2;             // подсчет радиуса
		 
        s = Math.PI * r * r ;  // подсчет площади
        
        System.out.println("площадь круга = "+s); // вывод площади
		
	}

}
