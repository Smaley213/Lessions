package by.htp.les02.tasks;
 //Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь

public class Task13 {
	public static void main(String[] args){
		
		double  x1, y1, x2, y2, x3, y3 ,s , p, a , b, c ; //создание переменных
		
		x1 = 2;  // присвоение значения переменным 
		x2 = 2;
		x3 = 2;
		y1 = 3;
		y2 = 3;
		y3 = 3;
		
		a = Math.sqrt((x2-x1)+(y2+y1)); // расчет длины стороны
		b = Math.sqrt((x3-x2)+(y3+y2)); 
		c = Math.sqrt((x3-x1)+(y3+y1)); 
		
		p = (a + b + c) / 2;  // расчет периметра
		
		s = Math.sqrt(p*(p-a) * (p-b) * (p-c));  // расчет площади
		
		System.out.println("Площадь = " + s + "\nПериметр = " + p);  // вывод в консоль результатов
			
    }

}
