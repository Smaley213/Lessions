package by.htp.les02.tasks;

// ����� ������� ������������ ������ � �������� ���� ��������������� �����

public class Task36 {
	public static void main(String[] args) {
		
		int a = 2345;  // ������������ �������� � ���������� � ���������� ����������
        int b = 1;
        int c = 1;
        
        boolean i = false;      // ������)
        
        while (a > 0) {            // �������
            int d = a % 10;
            if (i) {
                c *= d;
            } else {
                b *= d;
            }
            i = !i ;
            a /= 10;
        }
        
        System.out.println(b); // ����� �� ����� ������� 
        System.out.println(c);
		
	}

}
