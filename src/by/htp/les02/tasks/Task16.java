package by.htp.les02.tasks;
//Найти произведение цифр заданного четырехзначного числа.

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		
		int a, b, c, d ,x ,y ;
		Scanner sc  = new Scanner(System.in); // создание строки ввода данных 
		
		System.out.println("Введите четырехзначное число:");
		
		x = sc.nextInt();
		System.out.println("Заданное число = "+x);
		
		a = x /1000;
		b = (x-a*1000)/100;
		c = (x-a*1000 - b*100)/10;
		d = (x-a*1000 - b*100 -c*10);
		
		
		
		System.out.println("произведения числа \n  = "+a + "\n  = "+ b+ "\n  = "+c+"\n  = "+d);
		
	}

}
