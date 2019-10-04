package com.cg.ibs.remittancemgmt.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.cg.ibs.remittancemgmt.bean.CreditCard;

public class MainUI {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		CreditCard card = new CreditCard();
		int input = scanner.nextInt();
		DateFormat formatter = new SimpleDateFormat("MM yy");
		switch (input) {
		case 1:
			System.out.println(
					"Press 1 to Add / Modify CreditCard details \nPress 2 to Add / Modify Beneficiary Account details \nPress 3 to set up an Auto payment for IBS services");
			String choice = scanner.next();

			switch (Integer.parseInt(choice)) {
			case 1:

				System.out.println("Please Enter your CreditCard number (16 digits)");
				card.setcreditCardNumber(scanner.nextBigInteger());

				System.out.println("Please enter the Name on your CreditCard (Case Sensitive)");
				card.setnameOnCreditCard(scanner.next());
				System.out.println("Please enter the expiry date on your card number in (MM/YY) format");
				try {
					card.setcreditDateOfExpiry(formatter.parse(scanner.next()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 2:

				break;
			case 3:

				break;

			default:
				break;
			}

			break;
		case 2:

			break;

		default:
			break;
		}
	}
}
