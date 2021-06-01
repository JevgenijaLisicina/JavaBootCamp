
package sef.module3.activity;


public class NumToWords {


	public static void main(String[] args) {
		
		for ( int i = 1; i < 11; i++ ) {
			System.out.println ( "The value of i is:- " + i );
		}

		int i = 2;
		String numText ;
		switch(i) {
		case 1:
			numText = "ONE";
			break;
		case 2:
			numText = "TWO";
			break;
		case 3:
			numText = "THREE";
			break;
		case 4:
			numText = "FOUR";
			break;
		case 5:
			numText = "FIVE";
			break;
			// complete the code.
			case 6:
				numText = "SIX";
				break;

		default:
			numText = "NUMBER " + i;
		}

		System.out.println(numText);


	}
	

}
