// Author: Peter Adamson

public class StudentDriver{

	public static void main(String[] args) {

		Student s = new Student(8510804);

		Grade g = new Grade('B');

		Student t = new Student(8510805);

		Grade h = new Grade(40);

		Student u = new Student(8510806);

		Grade i = new Grade(90);

		System.out.println("Student" + s.getStudentID() + ": " + s.setGrade(g.getGradeLetter()) + "(" + s.setGrade(g.getGradePercent()) + "%)" );

		System.out.println("Student" + t.getStudentID() + ": " + t.setGrade(h.getGradeLetter()) + "(" + t.setGrade(h.getGradePercent()) + "%)" );

		System.out.println("Student" + u.getStudentID() + ": " + u.setGrade(i.getGradeLetter()) + "(" + u.setGrade(i.getGradePercent()) + "%)" );

		}


}
