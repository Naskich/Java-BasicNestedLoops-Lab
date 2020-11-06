
/*7.	*Билети за кино
Вашата задача е да напишете програма, която да изчислява процента на билетите за всеки тип от продадените билети: студентски(student), стандартен(standard) и детски(kid), за всички прожекции. Трябва да изчислите и колко процента от залата е запълнена за всяка една прожекция.
Вход
Входът е поредица от цели числа и текст:
•	На първия ред до получаване на командата "Finish" - име на филма – текст
•	На втори ред – свободните места в салона за всяка прожекция – цяло число [1 … 100]
•	За всеки филм, се чете по един ред до изчерпване на свободните места в залата или до получаване на командата "End":
o	Типа на закупения билет - текст ("student", "standard", "kid")
Изход
На конзолата трябва да се печатат следните редове:
•	След всеки филм да се отпечата, колко процента от кино залата е пълна
"{името на филма} - {процент запълненост на залата}% full."
•	При получаване на командата "Finish" да се отпечатат четири реда:
o	"Total tickets: {общият брой закупени билети за всички филми}"
o	"{процент на студентските билети}% student tickets."
o	"{процент на стандартните билети}% standard tickets."
o	"{процент на детските билети}% kids tickets."
Примерен вход и изход
Вход	Изход	Обяснения
Taxi
10
standard
kid
student
student
standard
standard
End
Scary Movie
6
student
student
student
student
student
student
Finish	Taxi - 60.00% full.
Scary Movie - 100.00% full.
Total tickets: 12
66.67% student tickets.
25.00% standard tickets.
8.33% kids tickets.	Първи филм – Taxi, местата в залата са 10
Купуват се 3 стандарти, 2 студентски, 1 детски билет и получаваме командата End.
Общо 6 билета от 10 места -> 60% от залата е заета.
Втори филм – Scary Movie, места в залата са 6
Купуват се 6 студентски билета и местата в залата свършват.
Общо 6 билета от 6 места -> 100% от залата е заета.
Получаваме командата Finish
Общо закупените билети за всички филми са 12.
За всички филми са закупени общо:
8 студентски билета. 8 билета от общо 12 е 66.67%
3 стандартни билета. 3 билета от общо 12 е 25%
1 детски билет. 1 билет от общо 12 е 8.33%
 * */
import java.util.Scanner;
public class CinemaTicketsIzpitna07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nameMuvie = scanner.nextLine();
		int sumTickets=0;
		int countKid=0;
		int countStandard=0;
		int countStudents=0;
		while (!nameMuvie.equals("Finish")) {
			int freePlace = Integer.parseInt(scanner.nextLine());
			int notFreePlace=0;
			while (true) {
				String ticketType=scanner.nextLine();
				if (ticketType.equals("End")) {
					break;
				}
				notFreePlace++;
				if (ticketType.equals("standard")) {
					countStandard+=1;
				} else if (ticketType.equals("student")) {
					countStudents+=1;
				} else if (ticketType.equals("kid")) {
					countKid+=1;
				}
				if (freePlace<=notFreePlace) {
					break;
				}	
			}
			sumTickets=countKid+countStandard+countStudents;
			double percentTickets = ((notFreePlace*1.0)/freePlace)*100;
			System.out.printf("%s - %.2f%% full.\n",nameMuvie,percentTickets);		
			nameMuvie = scanner.nextLine();
		}
			 System.out.printf("Total tickets: %d%n",sumTickets);
			 double percentStudent = ((countStudents*1.0)/sumTickets)*100;
			 System.out.printf("%.2f%% student tickets.\n",percentStudent);
			 double percentStandard=((countStandard*1.0)/sumTickets)*100;
			 System.out.printf("%.2f%% standard tickets.\n",percentStandard);
			 double percentKid=((countKid*1.0)/sumTickets)*100;
			 System.out.printf("%.2f%% kids tickets.\n",percentKid); 
	}
}
