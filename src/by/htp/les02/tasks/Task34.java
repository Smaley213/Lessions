package by.htp.les02.tasks;

import java.util.Scanner;

// ���� �������� �, ���������� ����� ���������� � ������. 
// ��������� � � ����� ������� ������� ��������� ����������.

public class Task34 {
	public static void main(String[] args) {
		
		System.out.println("������� �������� � � ������, ���� "+"\n�������� 9 ��������");
		
		 Scanner s = new Scanner(System.in);
		 
		int  k, m  ,h ; // �������� ����������
		
		h = s.nextInt();  //��������� ��� ��������
	
		k = h / 1024;         // ������������ 
		m = k / 1024;
		double g = m / 1024;
		double t = g / 1024;
		
		System.out.println("\nA = "+h+"\n�������� = "+k+"\n�������� = "+m+"\n�������� = "+g+"\n�������� = "+t); // ����� � �������
		
		
	}

}
