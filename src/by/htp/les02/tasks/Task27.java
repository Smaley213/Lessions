package by.htp.les02.tasks;
 
// ���� �������� a. �� ��������� ������� ������� � ������� ��������, ����� ���������,
//�������� �������� �8 �� ��� �������� � �10 �� ������ ��������.


public class Task27 {
	public static void main(String[] args) {
		
		double a;
		double x;
		double y;
		double z;
		double w;
		
		a = 2;//������������ ��������

		x = a * a;
		y = x * x;
		z = y * y;// 'a' � 8 �������
		w = z * x;// 'a' � 10 �������

		System.out.println("'a' � 8 ������� ����� " + z + "\n'a' � 10 ������� ����� " + w); 
	}

}
