package by.htp.les02.tasks;
//Написать программу, которая выводит на экран первые четыре степени числа π.

import java.util.Scanner;

public class Task15 {
		 public static void main(String[] args) {
    			
    			Scanner sc  = new Scanner(System.in); // создание строки ввода данных 
    			
    			System.out.println("Введите число:");
    			
    			int n = 0;
    			if(sc.hasNextInt()){      // условия 
    				
    				n = sc.nextInt();   // ввод данных пользователя
    			}else{
    				
    				System.out.println("Вы ввели не целое число либо строку!");
    			}
    			for(int i = 1; i <= 4; i++){
    				
    				int x = (int)Math.pow(n, i); // возведение степени
    				
    				System.out.println(n + " в степени " + i + " = " + x);
    			}
      }

}
