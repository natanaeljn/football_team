package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import entities.enums.position;

public class jogador {
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");

	private String name;
	private Double salary;
	private position pos;
	private Date end;

	public jogador() {

	}

	public jogador(String name, Double salary, position pos, Date end) {
		super();
		this.name = name;
		this.salary = salary;
		this.pos = pos;
		this.end = end;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public position getPos() {
		return pos;
	}

	public void setPos(position pos) {
		this.pos = pos;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public double monthsSalary(int ends, double atuall) {

		Calendar cal = Calendar.getInstance();

		cal.setTime(end);
		Calendar cal1 = Calendar.getInstance();
		Date atual = new Date();
		cal1.setTime(atual);
		int ends_year = cal.get((Calendar.YEAR));
		int atual_year = cal1.get((Calendar.YEAR));

		double total = ends_year - atual_year;
		double months = total * 12;
		double sum = months * salary;
		return sum;

	}

	public String toString() {
		return "name:" + name + "\n" + "salary:$" + salary + "\n" + "position:" + pos + "\n" + "end of contract date:"
				+ sdf1.format(end) + "\n" + "total of pain:" + String.format("%.2f\n", monthsSalary(0, 0));

	}

}
