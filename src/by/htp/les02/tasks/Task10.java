package by.htp.les02.tasks;

public class Task10 {
	public static void main(String[]args) {
		
		double a ,b, x, y, z ,sum1,sum2; // �������� ����������
		
		x = 5;  // ������������ �������� � ����������
		y = 4;
		
		//if (b == 0) { System.out.println("ERROR - ������ �� 0 ������");}
		
		a = Math.sin(x)+ Math.cos(y);  //1� ����� ���������
		b = Math.cos(x)- Math.sin(y);
		
		sum1 = a/b;                    //2� ����� ���������
		sum2 = sum1 * Math.tan(x*y);
		
		System.out.println(sum2);   // ����� ������ ��������� � �������
	}

}
