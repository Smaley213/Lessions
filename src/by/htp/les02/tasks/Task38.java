package by.htp.les02.tasks;

import java.util.Scanner;

// ��� ������ �������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (�, �)
// ����������� ����������� �������, � false � � ��������� ������:

public class Task38 {
	public static void main(String[] args) {
	
        Scanner h = new Scanner(System.in);
        
		// ���������� ������ ������������ A, B, C
		
		int x ,y ,a, b ,c;
		boolean z; 
		
		System.out.println(" ������� ���������� X � Y �� �������� ");  // ����� � ������� ����������
		
		x = h.nextInt();      // ���� ��������� 
	    y = h.nextInt();
		
		a = -3 ;  // �����e AB, BC � CA
	    b = 3;
	    c = 3;
		
	    if((y >= x + a) & (y <= x + b) & (y >= x - c )) ; {
	    
	    z = true ; 
	    
	    System.out.println("���������� = "+ z);  // ����� � ������� ����������
	    
	        } if ( (y <= x + a) && (y <= x + b) && (y >= x - c )); {
	        	
	    z = false;
	        
	    System.out.println("���������� = "+ z);  // ����� � ������� ���������� 
	    }
	    
	}

}
