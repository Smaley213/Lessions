package by.htp.les02.tasks;
// ��������� �������� ��������� �� ������� 

public class Task8 {
	public static void main(String[]args) {

		double a, b, c ,sum ,sum1 ,sum2 ; //������������ ����������

        
		a = 5; //������������ �������� ����������
		b = 6;
		c = 0;
		
		// if (s == 0) { System.out.println("ERROR - ������ �� 0 ������");}
			
		


		sum1 =  b + Math.sqrt(b * b + 4 * a * c);  // 1� ����� ���������
		sum2 = (2 * a);   // 2� ����� ���������
		sum = sum1 / sum2;
		sum = Math.pow(a, 3) * c + Math.pow(b, -2);          //3 � ����� 

		System.out.println("����� = " + sum);   //����� ������ � �������
		
	}

}
