package by.htp.les02.tasks;

//��������� ��������� �������� ��������� ���� ���� � �������, ������ � �������.

import static java.lang.Math.PI;

public class Task28 {
	public static void main(String[] args) {
		
		double  r, g ,m ,s; // �������� ����������
		
		r = 2;   // ������������ ���������� ������
		
		g = r * (180/PI);   // �������
		m = g * 60;
		s = g * 3600;
		
		System.out.println("������ = "+r+"\n������� = "+g+"\n������ = "+m+" "+ "\n������� = "+s);  // ����� � �������
	}

}
