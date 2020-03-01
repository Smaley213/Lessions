package by.htp.les02.tasks;

// Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.

public class Task40 {
	public static void main(String[] args) {
		
		int a ,y;
		int x = 3;
		
		a = -2 * x + 3 * (x * 2) - 4 * (x * 3) ;
	    y = 1 + (2 * x) + 3 * (x * 2) + 4 * (x *3) ;
	    
	    System.out.println(" первое уравнение равно = "+a+ "\n второе уравнение равно = "+y);
		
	}

}
