package by.htp.les02.tasks;

import java.util.Scanner;

// ����� ������� ������������, ��� ������� �������� ����� � � b, � ���� ����� ����� ��������� �.

public class Task26 {
	public static void main(String[] args) {
		
		double  a ,b, y ,s;  //�������� ����������
		
		 Scanner h = new Scanner(System.in);
			
		 System.out.println("������� �������� ����, ���������������");
		 
		    a = h.nextInt();      // ���� ��������
		    b = h.nextInt();
		    y = h.nextInt();
		
		s = a * b * Math.sin(y) / 2;  // ������� 
		
		System.out.println("������� = "+s);  // ����� �� �������
	}

}
