package by.htp.les02.tasks;

//Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, 
//и false — в противном случае:

public class Task37 {
    public static void main(String[] args) {
		
		boolean t = true;
		boolean f = false;
		
		
		System.out.print("1е действие ");       //Целое число N является четным двузначным числом. 
		
		int n = 24;  // присваивание и создание переменной
		
		if (n >= 10 && n%2 == 0) {             // условия
			
			System.out.println(t);
			
		 } else if (n <= 20 && n%2 == 0){
			System.out.println(t);
			
		}else {
			System.out.println(f);
		
		}
		
		
		System.out.print("\n 2е действие ");  //Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
		
		int n2 = 1919;   // присваивание и создание переменной
		int a, b, c, d;
		
		a = n2 % 10;       // вычисления
		n2 = n2 / 10;
		
		b = n2 % 10;
		n2 = n2 / 10;
		
		c = n2 % 10;
		d = n2 / 10;
		
		if ((d + c) == (b + a)) {        // условия
			
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 3е действие ");   ////Сумма цифр данного трехзначного числа N является четным числом.
		
		int n3 = 892;            // присваивание и создание переменной
		int n31, n32, n33;
		
		n33 = n3 % 10;       // вычисления
		n3 = n3 / 10;
		
		n32 = n3 % 10;
		n31 = n3 / 10;
		
		if ((n31 + n32 + n33) % 2 == 0) {        // условия
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 4е действие ");   //Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
		
		int x4 = 3;            // присваивание и создание переменной
		int y4 = -2;
		int m4 = -1;
		int n4 = 5;
		
		if (x4 >= m4 && x4 <= n4){        // условия
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 5е действие ");   //Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. 
		
		int n5 = 293;            // присваивание и создание переменной
		int n51, n52, n53, n55, sum5;
		
		n55 = n5;
		
		n51 = n5 % 10;       // вычисления
		n5 = n5 / 10;
		
		n52 = n5 % 10;
		n53 = n5 / 10;
		
		sum5 = n51 + n52 + n53;             /// вычисление
		
		if (n55 * n55 == Math.pow(sum5, 3)) {        // условия
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 6-е действие ");     //Треугольник со сторонами а,b,с является равнобедренным.
		
		int a6 = 3;            // присваивание и создание переменной
		int b6 = 7;
		int c6 = 2;
		
		if (a6==b6 || a6==c6 || b6==c6) {        // условия
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		 
		System.out.print("\n 7е действие ");   //Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
		
		int n7 = 115;            // присваивание и создание переменной
		int n71, n72, n73;
		
		n71 = n7 % 10;       // вычисления
		n7 = n7 / 10;
		n72 = n7 % 10;
		n73 = n7 / 10;
		
		if (n71 + n72 == n73 || n71 + n73 == n72 || n72 + n73 == n71) {        // условия
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 8-е действие ");  //Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4)
		
		int n8 = 3;            // присваивание и создание переменной
		int aa = 2;
		
		if (n8==1) {System.out.println(t);}               // условия
		
		else if (aa==n8) {System.out.println(t);} 
		else if (aa *aa == n8) {System.out.println(t);} 
		
		else if (Math.pow(aa , 3)==n8) {System.out.println(t);} 
		else if (Math.pow(aa , 4)==n8) {System.out.println(t);} 
		
		else {System.out.println(f);}
		
		
		System.out.print("\n 9-е действие ");   //График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п). 
		
		double m9 = 2;            // присваивание и создание переменной
		double n9 = 5;
		double x91, x92, x9, d9;
		
		double a9 = 10;
		double b9 = 9;
		double c9 = 2;
		double y9, y91 = 0, y92;
		
		d9 = b9 * b9 - 4 * a9 * c9;       // вычисления
		
		if (d9 > 0) {                        // условия
			x91 = (-1 * b9 + d9) / (2 * a9);
			x92 = (-1 * b9 - d9) / (2 * a9);
			
			y91 = a9 * (x91 * x91) + b9 * x91 + c9;
			y92 = a9 * (x92 * x92) + b9 * x92 + c9;
			y92 = y91;
			
			if ((m9==x91 || m9==x92) && n9 == y91) {
				
				System.out.println(t);
			} else {
				System.out.println(f);
			}
			
		} else if (d9 == 0) {                   // условия
			x91 = (-1 * b9) / (2 * a9);
			x92 = x91;
			y91 = a9 * (x91 * x91) + b9 * x91 + c9;
			y92 = y91;
			
			if ((m9==x91 || m9==x92) && n9 == y91) {
				
				System.out.println(t);
			} else {
				System.out.println(f);
			}
		 } else if (d9 < 0) {
			System.out.println(f);    // Вывод в консоль
		}
		
			
	}
    
}


