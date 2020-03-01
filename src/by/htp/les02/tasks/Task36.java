package by.htp.les02.tasks;

// Найти частное произведений четных и нечетных цифр четырехзначного числа

public class Task36 {
	public static void main(String[] args) {
		
		int a = 2345;  // Присваивание значений к переменной и обьявление переменных
        int b = 1;
        int c = 1;
        
        boolean i = false;      // Булеан)
        
        while (a > 0) {            // условие
            int d = a % 10;
            if (i) {
                c *= d;
            } else {
                b *= d;
            }
            i = !i ;
            a /= 10;
        }
        
        System.out.println(b); // Вывод на экран консоли 
        System.out.println(c);
		
	}

}
