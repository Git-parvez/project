package newcollege;

import java.util.Scanner;

public class EbBill {

	public static void main(String[] args) {
		int Rs=0,unit=0,lmr,cmr;
		System.out.println("enter the last month reading units:");
		Scanner sc =new Scanner(System.in);
		lmr = sc.nextInt();
		System.out.println("enter the current month reading units:");
		cmr = sc.nextInt();
		if(cmr>lmr) {
			unit=cmr-lmr;
		}
		else {
			System.out.println("always enter the Cmr value Greater than Lmr");
			System.exit(0);
		}
		if(unit>=300) {
			Rs=5;
		}
		else if(unit>=200)
		{
		    Rs=4;
		    
		}
		else {
			Rs=2;
		}
		System.out.println("Total no of units consuption :"+unit);
		System.out.println("Total amount to be paid: "+(unit*Rs));
		System.out.println("The Last month reading is :"+lmr);
		System.out.println("The current month reading is "+cmr);
	}
}
