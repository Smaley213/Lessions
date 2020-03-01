package by.htp.les02.tasks;

import java.util.Scanner;

// ƒл€ данных областей составить линейную программу, котора€ печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false Ч в противном случае:

public class Task38 {
	public static void main(String[] args) {
	
        Scanner h = new Scanner(System.in);
        
		// координаты вершин треугольника A, B, C
		
		int x ,y ,a, b ,c;
		boolean z; 
		
		System.out.println(" введите координаты X и Y по очередно ");  // вывод в консоль результата
		
		x = h.nextInt();      // ¬вод координат 
	    y = h.nextInt();
		
		a = -3 ;  // пр€мыe AB, BC и CA
	    b = 3;
	    c = 3;
		
	    if((y >= x + a) & (y <= x + b) & (y >= x - c )) ; {
	    
	    z = true ; 
	    
	    System.out.println("координаты = "+ z);  // вывод в консоль результата
	    
	        } if ( (y <= x + a) && (y <= x + b) && (y >= x - c )); {
	        	
	    z = false;
	        
	    System.out.println("координаты = "+ z);  // вывод в консоль результата 
	    }
	    
	}

}
