package by.htp.les02.tasks;
//��������� �������� ��������� �� ������� 

public class Task9 {
	public static void main(String[]args) {
		
		int a ,b, c, d, Sum ,Sum1; // ������������ ����������
		
		a = 20;   // ������������ �������� � ����������
		b = 34;
		c = 2;
		d = 1;
		
		Sum1= (a/c) * (b/d);  // 1� ����� �������
		
		Sum = Sum1 - (a*b - c) / c*d;  //2� ����� �������
		
		System.out.println(Sum);  // ����� ������ � �������
		
	}

}
