/*
 * Implement a banking system using java.

Create 3 sub class of Bank : SBI,BOI,ICICI

All 4 should have following methods:

getDetails which provide their specific details like rateofinterest etc
printDetails of every bank.
Every bank account should have a type (enum): SAVINGS, CURRENT
Implement a feature to deduct amount from account. Throw InsufficientAmountException,
if amount being deducted is less than the current balance.
Every banking transaction should be saved in a file of each bank's transaction log,
which would have all details of the transaction like 
(time of transaction,account number,amount withdrawn, amount before deduction, amount after deduction,
transaction status (can also be enum), failure reason if any)*/


package exe2;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		Boi b = new Boi();
		Icici i = new Icici();
		BankingSystem bank = new BankingSystem();
		Scanner scan = new Scanner(System.in);

		int option = '\0';
		int option2 = '\0';
		int option3 = '\0';
		int Salary;
		String name;
		int account;
		int money;
		char c;
		System.out.println("................Welcome to Bank.................");

		System.out.println("Name: " + bank.getName());
		System.out.println("Account Number: " + bank.getAccountNo());
		System.out.println("Salary: " + bank.getsalary());

		System.out.println("................Select your Bank.................");
		System.out.println("1.  SBI....");
		System.out.println("2.  BOI....");
		System.out.println("3.  ICICI....");

		do {
			option = scan.nextInt();
			switch (option) {

			case 1:
				System.out.println("Welcome to SBI Bank");
				System.out.println("What would you like to do?");
				System.out.println("D. Deposite");
				System.out.println("W. Withdraw");
				System.out.println("L. Check for log");
				System.out.println("Q. Exit");
				do {
					c = scan.next().charAt(0);
					switch (c) {
					case 'D':
						System.out.printf("Enter deposite amount  ");
						Salary = scan.nextInt();
						s.deposite(Salary);
						System.out.println("Your deposite Amount : " + s.deposite(Salary));
						break;
					case 'W':
						System.out.printf("Enter Withdrawn amount : ");
						Salary = scan.nextInt();
						s.withDrawl(Salary);
						System.out.println("Your withdrawn Amount : " + s.withDrawl(Salary));
						break;
					case 'L':
						s.log();
					case 'Q':
						System.out.println("Exit");
						break;
					default:
						System.out.println("Wrong Input!");
						break;
					}
				} while (c != 'Q');
				break;
			case 2:
				System.out.println("Welcome to Bank of India");
				System.out.println("What would you like to do?");
				System.out.println("D. Deposite");
				System.out.println("W. Withdraw");
				System.out.println("L. Check for log");
				System.out.println("Q. Exit");
				do {
					c = scan.next().charAt(0);
					switch (c) {
					case 'D':
						System.out.printf("Enter deposite amount : ");
						Salary = scan.nextInt();
						b.deposite(Salary);
						System.out.println("Your deposite Amount : " + b.deposite(Salary));
						break;
					case 'W':
						System.out.printf("Enter Withdrawn amount : ");
						Salary = scan.nextInt();
						b.withDrawl(Salary);
						System.out.println("Your withdrawn Amount : " + b.withDrawl(Salary));
						break;
					case 'L':
						b.log();
					case 'Q':
						System.out.println("Exit");
						break;
					default:
						System.out.println("Wrong Input!");
						break;
					}
				} while (c != 'Q');
				break;

			case 3:
				System.out.println("Welcome to ICICI Bank");
				System.out.println("What would you like to do?");
				System.out.println("D. Deposite");
				System.out.println("W. Withdraw");
				System.out.println("L. Chexk for log");
				System.out.println("Q. Exit");
				do {
					c = scan.next().charAt(0);
					switch (c) {
					case 'D':
						System.out.printf("Enter deposite amount : ");
						Salary = scan.nextInt();
						i.deposite(Salary);
						System.out.println("Your deposite Amount : " + i.deposite(Salary));
						break;
					case 'W':
						System.out.printf("Enter Withdrawn amount : ");
						Salary = scan.nextInt();
						i.withDrawl(Salary);
						System.out.println("Your withdrawn Amount : " + i.withDrawl(Salary));
						break;
					case 'L':
						i.log();
					case 'Q':
						System.out.println("Exit");
						break;
					default:
						System.out.println("Wrong Input!");
						break;
					}
				} while (c != 'Q');
				break;
			default:
				System.out.print("Oops! Something went wrong");
				break;
			}
			break;
		} while (option != 3);

	}

}
