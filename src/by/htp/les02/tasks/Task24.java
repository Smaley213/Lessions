package by.htp.les02.tasks;

// Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании  а

public class Task24 {
	public static void main(String[] args) {
		
		double a, b , s ,alpha ;  // создание переменных
		
		a=3;   //присваивание значений к переменным
		b=2;
		
		alpha=Math.PI/4; // подсчет угла
		
		s=(a+b)*(a-b)*Math.tan(alpha)/4; // нахождение площади а и b
		
		System.out.println("S="+s);  // вывод в консоль результата
	}

}
