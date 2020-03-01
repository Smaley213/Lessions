package by.htp.les02.tasks;

import java.util.Scanner;

// Вычислить корни квадратного уравнения
// ах2+ bх + с = 0 с заданными коэффициентами a, b и с 
//(предполагается, что а≠0 и что дискриминант уравнения неотрицателен).

public class Task25 {
	public static void main(String[] args) {
		
		double a , b , c ,d , e , f ;  //Задаем тип переменных.
		
		System.out.println("Для Вычисления корней квадратного уравнения, введите значения по очереди ниже ");
		
        Scanner h = new Scanner(System.in);
		
	    a = h.nextInt();      // Ввод коэфициентов 
	    b = h.nextInt();
	    c = h.nextInt();
	    
	    d = (b * b) - (4 * a * c);    // Считает дискриминант 
	    
	    if(d==0)           // Если дискриминант = 0, будет 1 корень.
	    {
	        e = (-b + Math.sqrt(d)) / ( 2 * a);
	        f = (-b - Math.sqrt(d)) / ( 2 * a);
	        
	        System.out.println(e);  // вывод
	        System.out.println(f);
	    }
	    
	    if(d>0) // Если дискриминант > 0, будет 2 корня.
	    {
	        e = (- b + Math.sqrt(d)) / (2*a);
	        f = (- b - Math.sqrt(d)) / (2*a);
	        
	        System.out.println(e);  // вывод
	        System.out.println(f);
	    }
	    
	    if(d<0) // Если дискриминант меньше нуля - нет корней.
	    	
	    {
	    	System.out.println("Нет корня !");  // вывод
	    	}
	        
	    }    

}
