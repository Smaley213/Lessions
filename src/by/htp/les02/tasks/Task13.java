package by.htp.les02.tasks;
 //������ ���������� ���� ������ ������������ (�1 �2),(�2, �2) ),(�3, �3). ����� ��� �������� � �������

public class Task13 {
	public static void main(String[] args){
		
		double  x1, y1, x2, y2, x3, y3 ,s , p, a , b, c ; //�������� ����������
		
		x1 = 2;  // ���������� �������� ���������� 
		x2 = 2;
		x3 = 2;
		y1 = 3;
		y2 = 3;
		y3 = 3;
		
		a = Math.sqrt((x2-x1)+(y2+y1)); // ������ ����� �������
		b = Math.sqrt((x3-x2)+(y3+y2)); 
		c = Math.sqrt((x3-x1)+(y3+y1)); 
		
		p = (a + b + c) / 2;  // ������ ���������
		
		s = Math.sqrt(p*(p-a) * (p-b) * (p-c));  // ������ �������
		
		System.out.println("������� = " + s + "\n�������� = " + p);  // ����� � ������� �����������
			
    }

}
