package by.htp.les02.tasks;

//��������� �������� ���������, ���������� �������� true, ���� ��������� ������������ �������� ��������, 
//� false � � ��������� ������:

public class Task37 {
    public static void main(String[] args) {
		
		boolean t = true;
		boolean f = false;
		
		
		System.out.print("1� �������� ");       //����� ����� N �������� ������ ���������� ������. 
		
		int n = 24;  // ������������ � �������� ����������
		
		if (n >= 10 && n%2 == 0) {             // �������
			
			System.out.println(t);
			
		 } else if (n <= 20 && n%2 == 0){
			System.out.println(t);
			
		}else {
			System.out.println(f);
		
		}
		
		
		System.out.print("\n 2� �������� ");  //����� ���� ������ ���� ��������� ��������������� ����� ����� ����� ���� ��� ��������� ����.
		
		int n2 = 1919;   // ������������ � �������� ����������
		int a, b, c, d;
		
		a = n2 % 10;       // ����������
		n2 = n2 / 10;
		
		b = n2 % 10;
		n2 = n2 / 10;
		
		c = n2 % 10;
		d = n2 / 10;
		
		if ((d + c) == (b + a)) {        // �������
			
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 3� �������� ");   ////����� ���� ������� ������������ ����� N �������� ������ ������.
		
		int n3 = 892;            // ������������ � �������� ����������
		int n31, n32, n33;
		
		n33 = n3 % 10;       // ����������
		n3 = n3 / 10;
		
		n32 = n3 % 10;
		n31 = n3 / 10;
		
		if ((n31 + n32 + n33) % 2 == 0) {        // �������
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 4� �������� ");   //����� � ������������ (�, �) ����������� ����� ���������, ������� ����� ������� �= �, �= � (�<�).
		
		int x4 = 3;            // ������������ � �������� ����������
		int y4 = -2;
		int m4 = -1;
		int n4 = 5;
		
		if (x4 >= m4 && x4 <= n4){        // �������
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 5� �������� ");   //������� ��������� ������������ ����� ����� ���� ����� ���� ����� �����. 
		
		int n5 = 293;            // ������������ � �������� ����������
		int n51, n52, n53, n55, sum5;
		
		n55 = n5;
		
		n51 = n5 % 10;       // ����������
		n5 = n5 / 10;
		
		n52 = n5 % 10;
		n53 = n5 / 10;
		
		sum5 = n51 + n52 + n53;             /// ����������
		
		if (n55 * n55 == Math.pow(sum5, 3)) {        // �������
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 6-� �������� ");     //����������� �� ��������� �,b,� �������� ��������������.
		
		int a6 = 3;            // ������������ � �������� ����������
		int b6 = 7;
		int c6 = 2;
		
		if (a6==b6 || a6==c6 || b6==c6) {        // �������
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		 
		System.out.print("\n 7� �������� ");   //����� �����-���� ���� ���� ��������� ������������ ������������ ����� N ����� ������� �����.
		
		int n7 = 115;            // ������������ � �������� ����������
		int n71, n72, n73;
		
		n71 = n7 % 10;       // ����������
		n7 = n7 / 10;
		n72 = n7 % 10;
		n73 = n7 / 10;
		
		if (n71 + n72 == n73 || n71 + n73 == n72 || n72 + n73 == n71) {        // �������
			System.out.println(t);
			
		} else {
			System.out.println(f);
		}
		
		
		System.out.print("\n 8-� �������� ");  //�������� ����� N �������� �������� ����� � (���������� ������� ����� ���������� � ��������� �� 0 �� 4)
		
		int n8 = 3;            // ������������ � �������� ����������
		int aa = 2;
		
		if (n8==1) {System.out.println(t);}               // �������
		
		else if (aa==n8) {System.out.println(t);} 
		else if (aa *aa == n8) {System.out.println(t);} 
		
		else if (Math.pow(aa , 3)==n8) {System.out.println(t);} 
		else if (Math.pow(aa , 4)==n8) {System.out.println(t);} 
		
		else {System.out.println(f);}
		
		
		System.out.print("\n 9-� �������� ");   //������ ������� � = ��2 + b�+ � �������� ����� �������� ����� � ������������ (m, �). 
		
		double m9 = 2;            // ������������ � �������� ����������
		double n9 = 5;
		double x91, x92, x9, d9;
		
		double a9 = 10;
		double b9 = 9;
		double c9 = 2;
		double y9, y91 = 0, y92;
		
		d9 = b9 * b9 - 4 * a9 * c9;       // ����������
		
		if (d9 > 0) {                        // �������
			x91 = (-1 * b9 + d9) / (2 * a9);
			x92 = (-1 * b9 - d9) / (2 * a9);
			
			y91 = a9 * (x91 * x91) + b9 * x91 + c9;
			y92 = a9 * (x92 * x92) + b9 * x92 + c9;
			y92 = y91;
			
			if ((m9==x91 || m9==x92) && n9 == y91) {
				
				System.out.println(t);
			} else {
				System.out.println(f);
			}
			
		} else if (d9 == 0) {                   // �������
			x91 = (-1 * b9) / (2 * a9);
			x92 = x91;
			y91 = a9 * (x91 * x91) + b9 * x91 + c9;
			y92 = y91;
			
			if ((m9==x91 || m9==x92) && n9 == y91) {
				
				System.out.println(t);
			} else {
				System.out.println(f);
			}
		 } else if (d9 < 0) {
			System.out.println(f);    // ����� � �������
		}
		
			
	}
    
}


