// Author: Peter Adamson

public class Grade{

	private char gradeLetter;

	private int gradePercent;

	public Grade (char letterGrade){

		gradeLetter = letterGrade;

		gradePercent = Registrar.lettertoPercent(gradeLetter);
	
	}

	public Grade (int percentGrade){

		gradePercent = percentGrade;

		gradeLetter = Registrar.percenttoLetter(gradePercent);


	}

	public Grade(){

	}

	public int getGradePercent(){

		return gradePercent;

	}

	public char getGradeLetter(){

		return gradeLetter;

	}

}
