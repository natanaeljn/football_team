package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.club;
import entities.jogador;
import entities.enums.position;

public class main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		System.out.println("what the club name?");
		String nameOfClub = sc.nextLine();
		System.out.println("found of instituition:");
		Double founds = sc.nextDouble();
		club club = new entities.club(nameOfClub, founds);
		double sum = 0 ;
		
		System.out.println("how many players this club have?:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("name of player:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("salary");
			double salary = sc.nextDouble();
			System.out.println("position:");
			sc.nextLine();
			String posi = sc.nextLine();
			System.out.println("date of end contract:YYYY");
			Date end = sdf.parse(sc.next());
			position pos;
			jogador jogador = new entities.jogador(name, salary, position.valueOf(posi), end);
			Calendar cal = Calendar.getInstance();

			cal.setTime(end);
			Calendar cal1 = Calendar.getInstance();
			Date atual = new Date();
			cal1.setTime(atual);
			int ends_year = cal.get((Calendar.YEAR));
			int atual_year = cal.get((Calendar.YEAR));

			jogador.monthsSalary(ends_year, atual_year);
			sum+=jogador.monthsSalary(ends_year, atual_year);
			club.addList(jogador);
		}
		System.out.println(club);
		
		double pains = club.getFounds() - sum ;
		
		System.out.printf("total payable on contracts: R$ %.2f\n" , pains);
		
		
		
		
		
		

		sc.close();
	}

}
