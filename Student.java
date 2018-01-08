// Author: Peter Adamson

public class Student{

	private int studentID;

	private int gradePercent;

	private char gradeLetter;

	public Student(int studentNumber){

		studentID = studentNumber;

	}

	public Student(){

	}

	public char setGrade(char Letter){

		gradeLetter = Letter;

		return gradeLetter;
		
	}

	public int setGrade(int Percent){

		gradePercent = Percent;	

		return gradePercent;

	}

	public int getStudentID(){
	
		return studentID;

	}

	public char getgradeLetter(){

		return gradeLetter;

	}

	public int getgradePercent(){

		return gradePercent;

	}

}
