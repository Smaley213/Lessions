package by.htp.les02.tasks;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
//Вывести данное значение длительности в часах, минутах и секундах в следующей форме:ННч ММмин SSc.

import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {
		
		int t;
		
		System.out.println("введите длительность времени в секундах  ");
		
		Scanner a = new Scanner(System.in);
		
	    t = a.nextInt();
	    
	    System.out.println("Заданный период = ");
	    System.out.println("\nЧасов "+(double)t/3600+"\nМинут "+t/60+"\nСекунд "+t);
	    
		
	}

}
