package by.htp.les02.tasks;
//����� ������������ ���� ��������� ��������������� �����.

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		
		int a, b, c, d ,x ,y ;
		Scanner sc  = new Scanner(System.in); // �������� ������ ����� ������ 
		
		System.out.println("������� �������������� �����:");
		
		x = sc.nextInt();
		System.out.println("�������� ����� = "+x);
		
		a = x /1000;
		b = (x-a*1000)/100;
		c = (x-a*1000 - b*100)/10;
		d = (x-a*1000 - b*100 -c*10);
		
		
		
		System.out.println("������������ ����� \n  = "+a + "\n  = "+ b+ "\n  = "+c+"\n  = "+d);
		
	}

}
