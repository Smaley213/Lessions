package by.htp.les02.tasks;
//���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. 
//������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����:��� ����� SSc.

import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {
		
		int t;
		
		System.out.println("������� ������������ ������� � ��������  ");
		
		Scanner a = new Scanner(System.in);
		
	    t = a.nextInt();
	    
	    System.out.println("�������� ������ = ");
	    System.out.println("\n����� "+(double)t/3600+"\n����� "+t/60+"\n������ "+t);
	    
		
	}

}
