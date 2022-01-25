package newcollege;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("Enter the month number:");
		Scanner scan = new Scanner(System.in);
		int month=scan.nextInt();
		String monthString=" ";
		switch(month) {
		case 1:monthString="1-january";
		break;
		case 2:monthString="2-Febuary";
		break;
		case 3:monthString="3-march";
		break;
		case 4:monthString="4-April";
		break;
		case 5:monthString="5-may";
		break;
		case 6:monthString="6-june";
		break;
		case 7:monthString="7-july";
		break;
		case 8:monthString="8-August";
		break;
		case 9:monthString="9-september";
		break;
		case 10:monthString="10-october";
		break;
		case 11:monthString="11-november";
		break;
		case 12:monthString="12-December";
		break;
		default:System.out.println("invalid Month!");
		}
		System.out.println(monthString);
	}
}
