package by.htp.les02.tasks; 
 //ƒана длина ребра куба. Ќайти площадь грани, площадь полной поверхности и объем этого куба

public class Task18 {
	public static void main(String[] args) {
		
      int a ,b, c,v;  // создание переменных
      
      a = 10; // длина грани
      System.out.println("«адана длина грани = "+a);
      
      b = a*2; // вычисление площади грани
      System.out.println("площадь грани = "+b);

      c = b * 4;  // вычисление площади полной поверхности
      System.out.println("площадь полной поверхности = "+c);
      
      v = a*3;  // вычисление обьема
      
      System.out.println("обьем = "+v);
		
	}

}
