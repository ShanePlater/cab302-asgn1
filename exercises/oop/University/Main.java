package oop.University;

public class Main {
	public static void main(String[] args) {

		Student s1 = new Student(Title.BACHELOR_STUDENT, 0, "Shane", 10);
		Student s2 = new Student(Title.MASTERS_STUDENT, 1, "Steve", 15);

		System.out.println(s1.toString());
		System.out.println(s2.toString());

		Staff st1 = new Staff(Title.TUTOR, 2, "Carol");
		Staff st2 = new Staff(Title.LECTURER, 3, "Andrew");
		st1.setHours(25);

		System.out.println(st1.toString());
		System.out.println(st2.toString());

		System.out.print("s1: " + s1.getWeeklyPay() + " s2: " + s2.getWeeklyPay() + " st1:" + st1.getWeeklyPay() + " st2: " + st2.getWeeklyPay());

	}
}