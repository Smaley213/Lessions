package by.htp.les02.tasks;

//����� ������� ������, ���������� ������ �������� ����� r, � ������� � R (R> r).

public class Task23 {
	public static void main(String[] args) {
		
		int R,r;   // �������� ����������
		double s;
		
		R = 10;    // ������������ �������� � ����������
		r = 4;
		
		 System.out.println("������� ������ = "+ R ); // ����� �������� 
		 System.out.println("���������� ������ = "+ r ); 
		
		s=Math.PI*(R*R-r*r); // ������� 
		
		 System.out.println("������� = "+s); // ����� ������� � �������
	}

		
}
