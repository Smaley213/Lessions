package by.htp.les02.tasks;
//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

public class Task14 {
	public static void main(String[] args){
		
		double r, s, l; //создание переменных
		
        r = 5.5;               // присвоение переменной радиуса
        s = 3.14 * r * r;    //  площадь решение
        l = 2.0 * 3.14 * r;    // длина решение
       
       System.out.println("Площадь = " + s + "\nДлина = " + l);  // суммируем
		
	}

}
