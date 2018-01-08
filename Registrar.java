// Author: Peter Adamson

public class Registrar{

	public static int lettertoPercent(char Letter){

		int Percent = 0;
	
		if (Letter == 'A'){

			Percent = 95;
		}

		else if (Letter == 'B'){

			Percent = 85;
		}

		else if (Letter == 'C'){

			Percent = 75;
		}

		else if (Letter == 'D'){

			Percent = 65;
		}

		else if (Letter == 'F'){

			Percent = 55;
		}

		return Percent;

	}


	public static char percenttoLetter(int Percent){

		char Letter;

		if (Percent >= 90){

			Letter = 'A';
		}

		else if (Percent >= 80){

			Letter = 'B';

		}

		else if (Percent >= 70){

			Letter = 'A';
			
		}

		else if (Percent >= 60){

			Letter = 'D';
			
		}

		else {

			Letter = 'F';
		}

		return Letter;
	}

}
