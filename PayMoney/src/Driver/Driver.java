package Driver;

import Com.GreatLearning.coreJava.PayMoneyTransactions;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Transaction Array");
		int size = sc.nextInt();
		int[] transaction = new int[size];

		System.out.println("Enter the values of the array");
		for (int i = 0; i < size; i++) {
			transaction[i] = sc.nextInt();
		}

		System.out.println("Enter the total number of tragets that need to be ");
		int numTragets = sc.nextInt();

		for (int t = 0; t < numTragets; t++) {
			System.out.println("Enter the value of the traget: ");
			int traget = sc.nextInt();

			PayMoneyTransactions.findTransactions(transaction, traget);
		}
		sc.close();
	}

}
