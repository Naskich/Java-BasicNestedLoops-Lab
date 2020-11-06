
/*4.	Сума от две числа
Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две дадени числа. На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число. Ако няма нито една комбинация отговаряща на условието се отпечатва съобщение, че не е намерено.
Вход
Входът се чете от конзолата и се състои от три реда:
•	Първи ред – начало на интервала – цяло число в интервала [1...999]
•	Втори ред – край на интервала – цяло число в интервала [по-голямо от първото число...1000]
•	Трети ред – магическото число – цяло число в интервала [1...10000]
Изход
На конзолата трябва да се отпечата един ред, според резултата:
•	Ако е намерена комбинация чиито сбор на числата е равен на магическото число
o	"Combination N:{пореден номер} ({първото число} + {второ число} = {магическото число})"
•	Ако не е намерена комбинация отговаряща на условието
o	"{броят на всички комбинации} combinations - neither equals {магическото число}"
Примерен вход и изход
Вход	Изход	Обяснения	Вход	Изход
1
10
5	Combination N:4 (1 + 4 = 5)	Всички комбинации  от две числа между 1 и 10 са:
1 1, 1 2, 1 3, 1 4, 1 5, ... 2 1, 2 2, ... 4 9, 4 10, 5 1 ... 10 9, 10 10
Първата комбинация, чиито сбор на числата е равен на магическото число 5 е четвъртата (1 и 4)
	88
888
1000	Combination N:20025 (112 + 888 = 1000)
Вход	Изход	Обяснения	Вход	Изход
23
24
20	4 combinations - neither equals 20	Всички комбинации  от две числа между 23 и 24 са: 23 23, 23 24, 24 23, 24 24 (общо 4)
Няма двойки числа, чиито сбор е равен на магическото 20	88
888
2000	641601 combinations - neither equals 2000

 * */
import java.util.Scanner;
public class SumofTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberFirst = Integer.parseInt(scanner.nextLine());
		if (numberFirst>0&&numberFirst<1000) {
			int numberSecond = Integer.parseInt(scanner.nextLine());
			if (numberSecond>numberFirst&&numberSecond<1001) {
				int magicalNumber = Integer.parseInt(scanner.nextLine());
					if (magicalNumber>0 && magicalNumber<10001) {
						boolean isFound=false;
						int numberCombination=0;
						for (int i = numberFirst; i <=  numberSecond; i++) {
							for (int j = numberFirst; j <= numberSecond; j++) {
								numberCombination++;
								if (i+j==magicalNumber) {
									isFound=true;
									System.out.printf("Combination N:"+numberCombination+" (%d + %d = %d)",i,j,magicalNumber);
									break;
								}	
							}
							if (isFound) {
								break;
							}
						}
						if (!isFound) {
							System.out.printf(numberCombination+" combinations - neither equals "+magicalNumber);
						}
					}else {
						System.out.print("Inavalid Magical number!");
						}				
			}else {
				System.out.print("Inavalid number!");
			}	
		} else {
			System.out.print("Inavalid number!");
		}
	}
}
