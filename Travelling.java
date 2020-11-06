
/* 5 ЗАДАЧА - РЕШЕНА НА 70%
 * Ани обича да пътува и иска тази година да посети няколко различни дестинации. Като си избере дестинация, ще прецени колко пари ще й трябват, за да отиде до там и ще започне да спестява. Когато е спестила достатъчно, ще може да пътува.
От конзолата всеки път ще се четат първо дестинацията и минималния бюджет, който ще е нужен за пътуването, реално число. 
След това ще се четат няколко суми, реални числа, които Ани спестява като работи и когато успее да събере достатъчно за пътуването, ще заминава, като на конзолата трябва да се изпише:
 "Going to {дестинацията}!" 
Когато е посетила всички дестинации, които иска, вместо дестинация ще въведе "End" и програмата ще приключи.
Примерен вход и изход
Вход	Изход	Вход	Изход
Greece
1000
200
200
300
100
150
240
Spain
1200
300
500
193
423
End	Going to Greece!
Going to Spain!	France
2000
300
300
200
400
190
258
360
Portugal
1450
400
400
200
300
300
Egypt
1900
1000
280
300
500
End	Going to France!
Going to Portugal!
Going to Egypt!

 * */
import java.util.Scanner;
public class Travelling {
	public static void main(String[] args) {//		
	Scanner scanner = new Scanner(System.in);
		String nameDestination = scanner.nextLine();	
		while (!nameDestination.equals("End")) {
			int sumMoney=0;
			int moneyTrip = Integer.parseInt(scanner.nextLine());	
			while (sumMoney<moneyTrip) {			
				String moneyHoliday =  scanner.nextLine();
			if (moneyHoliday.equals("End")) {
				break;	
			}
		 int lastMoney = Integer.parseInt(moneyHoliday);
		 sumMoney+=lastMoney;
			}
				System.out.printf("Going to %s!\n",nameDestination );				
			nameDestination = scanner.nextLine();
		}		
	}
}