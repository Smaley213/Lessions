package by.htp.les02.tasks;

// ����� (� �������� � ��������) ��� ���� ������������ �� ��������� �, b, �.

import static java.lang.Math.*;


public class Task29 {
	public static void main(String[] args) {
		
		System.out.println("����� (� �������� / � ��������) ��� ���� ������������ �� ��������� �, b, �.");
		
		double a, b, c, d ,e , f, g ,x, y, z ,r1, r2, r3; //�������� ����������
		
		a = 33;  // ������������ �������� � ���������� 
		b = 40;
		c = 65;
		
		d = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2*a * b);  // �������
		e = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2*a * c);  
		f = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2*b * c);
		
		r1 = Math.acos(d); /// ��� �������
		r2 = Math.acos(e);
		r3 = Math.acos(f);
		
		x = (180 / Math.PI) * r1;  // ��� �������
		y = (180 / Math.PI) * r2;
		z = (180 / Math.PI) * r3;
		
		System.out.println("\n"+" �������� � ��������"+"\n���� AB = "+r1+"\n���� BC = "+r2+"\n���� CD = "+r3+"\n");
		System.out.println(" �������� � ��������"+"\n���� AB = "+x+"\n���� BC = "+y+"\n���� CD = "+z);
	}
	

}
